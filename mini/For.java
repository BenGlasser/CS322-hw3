package mini;

import compiler.Failure;

/** Abstract syntax for "for" loops.
 */
class For extends Stmt {

    private ForInit init;
    private Expr    test;
    private Expr    step;
    private Stmt    body;

    For(ForInit init, Expr test, Expr step, Stmt body) {
        this.init = init;
        this.test = test;
        this.step = step;
        this.body = body;
    }

    /** Check that this statement is valid, taking the current environment
     *  as an argument and returning a possibly modified environment as a
     *  result.
     */
    public VarEnv check(Fundef def, Context ctxt, boolean inLoop, VarEnv env)
      throws Failure {

        // Find the environment that is produced by the initializer
        VarEnv ienv = init.check(def, ctxt, env);

        // Check that the test is a Boolean
        try {
            if (test!=null && !test.typeOf(ctxt, ienv).equal(Type.BOOLEAN)) {
               ctxt.report(new Failure("Boolean test expected in while loop"));
            }
        } catch (Failure f) {
            // report any error that occured while checking the expression.
            ctxt.report(f);
        }

        // Check that the step is a valid expression
        if (step!=null) {
            step.typeOf(ctxt, ienv);
        }

        // check body, but discard any modified environment that it produces.
        body.check(def, ctxt, true, ienv);

        def.returns = false;
        return env;
    }

    /** Generate code for executing this statement.
     */
    public void compile(Assembly a, int pushed) {
        // TODO: Provide an implementation for this method
        String Loop = a.newLabel();
        String Test = a.newLabel();
        init.compile(a, pushed);
        a.emit("jmp", Test);
        a.emitLabel(Loop);
        body.compile(a, pushed);

        //  If we hae encountered continues in the compilation of the body
        //  we need to emit the break label to jump to here
        if (!Continue.stack.isEmpty())
            a.emitLabel(Continue.stack.pop());

        if (step != null)
            step.compileExpr(a, pushed, 0);

        a.emitLabel(Test);
        if (test != null)
            test.branchTrue(a, pushed, 0, Loop);
        else
            a.emit("jmp", Loop);

        //  If we hae encountered in breaks in the compilation of the body
        //  we need to emit the break label to jump to here
        if (!Break.stack.isEmpty())
            a.emitLabel(Break.stack.pop());
    }
}
