package mini;

import compiler.*;
import compiler.Failure;

/** Abstract syntax for while statements.
 */
class While extends Stmt {


    private Expr test;
    private Stmt body;
    While(Expr test, Stmt body) {
        this.test = test;
        this.body = body;
    }

    /** Check that this statement is valid, taking the current environment
     *  as an argument and returning a possibly modified environment as a
     *  result.
     */
    public VarEnv check(Fundef def, Context ctxt, boolean inLoop, VarEnv env)
      throws Failure {
        try {
            if (!test.typeOf(ctxt, env).equal(Type.BOOLEAN)) {
               ctxt.report(new Failure("Boolean test expected in while loop"));
            }
        } catch (Failure f) {
            // report any error that occured while checking the expression.
            ctxt.report(f);
        }
        // check body, but discard any modified environment that it produces.
        body.check(def, ctxt, true, env);
        def.returns = false;
        return env;
    }

    /** Generate code for executing this statement.
     */
    public void compile(Assembly a, int pushed) {
        String lab1 = a.newLabel();
        String lab2 = a.newLabel();
        a.emit("jmp", lab2);
        a.emitLabel(lab1);
        body.compile(a, pushed);

        //  If we hae encountered continues in the compilation of the body
        //  we need to emit the break label to jump to here
        if (!Continue.stack.isEmpty())
            a.emitLabel(Continue.stack.pop());

        a.emitLabel(lab2);

        if (test != null)
            test.branchTrue(a, pushed, 0, lab1);
        else
            a.emit("jmp", lab2);
        test.branchTrue(a, pushed, 0, lab1);


        //  If we hae encountered in breaks in the compilation of the body
        //  we need to emit the break label to jump to here
        if (!Break.stack.isEmpty())
            a.emitLabel(Break.stack.pop());
    }
}
