package mini;

import compiler.Failure;

public class ExprInit extends ForInit {
    private Expr expr;
    ExprInit(Expr expr) {
        this.expr = expr;
    }

    /** Check that this for initializer is valid, returning the
     *  variable environment after the initializer has run, which
     *  may have added new entries if the initializer introduces
     *  local variables (i.e., the VarDeclInit case).
     */
    public VarEnv check(Fundef def, Context ctxt, VarEnv env)
      throws Failure {
        expr.typeOf(ctxt, env);
        return env;
    }

    /** Generate code for executing this for loop initializer.
     */
    public void compile(Assembly a, int pushed) {
        // TODO: provide an implementation for this method
        expr.compileExpr(a, pushed, 0);
    }
}
