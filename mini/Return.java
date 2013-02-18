package mini;

import compiler.*;
import compiler.Failure;

/** Abstract syntax for return statements.
 */
class Return extends Stmt {
    private Expr expr;
    Return(Expr expr) {
        this.expr = expr;
    }

    /** Special version of the constructor for Return to be used when
     *  no return expression is specified.
     */
    Return() {
        this(null);
    }

    /** Check that this statement is valid, taking the current environment
     *  as an argument and returning a possibly modified environment as a
     *  result.
     */
    public VarEnv check(Fundef def, Context ctxt, boolean inLoop, VarEnv env)
      throws Failure {
        return def.checkReturn(expr, ctxt, env);
    }

    /** Generate code for executing this statement.
     */
    public void compile(Assembly a, int pushed) {
        if (expr!=null) {
           expr.compileExpr(a, pushed, 0);
        }
        a.emitEpilogue();
    }
}
