package mini;

import compiler.*;
import compiler.Failure;

/** Abstract syntax for print statements.
 */
class Print extends Stmt {
    private Expr exp;
    Print(Expr exp) {
        this.exp = exp;
    }

    /** Check that this statement is valid, taking the current environment
     *  as an argument and returning a possibly modified environment as a
     *  result.
     */
    public VarEnv check(Fundef def, Context ctxt, boolean inLoop, VarEnv env)
      throws Failure {
        try {
            if (!exp.typeOf(ctxt, env).equal(Type.INT)) {
               ctxt.report(new Failure("print requires integer argument"));
            }
        } catch (Failure f) {
            // report any error that occured while checking the expression.
            ctxt.report(f);
        }
        def.returns = false;
        return env;
    }

    /** Generate code for executing this statement.
     */
    public void compile(Assembly a, int pushed) {
        // How many bytes will we need to push on to the stack to
        // ensure appropriate alignment after we have pushed the
        // single word argument required by the print primitive?
        int adjust = a.alignmentAdjust(pushed+Assembly.WORDSIZE);
  
        // Note that if we were calling a function with n arguments
        // (which we could determine by calculating the length of
        // the argument list), then we would need to compute an
        // alignment for (pushed + n * Assembly.WORDSIZE)
  
        // insert alignment bytes before we start constructing frame
        a.insertAdjust(adjust);
  
        // compile and push argument to be printed:
        exp.compileExpr(a, pushed+adjust, 0);
        a.emit("pushl", a.reg(0));
  
        // invoke function, with appropriate alignment:
        a.call("print", 0);
  
        // remove parameter, plus any bytes that were added to meet
        // alignment constraints:
        a.removeAdjust(adjust+ Assembly.WORDSIZE);
    }
}
