package mini;

import compiler.*;
import compiler.Failure;

import java.util.Stack;

/** Abstract syntax for continue statements.
 */
class Continue extends Stmt {
    static Stack<String> stack = new Stack<String>();

    /** Check that this statement is valid, taking the current environment
     *  as an argument and returning a possibly modified environment as a
     *  result.
     */
    public VarEnv check(Fundef def, Context ctxt, boolean inLoop, VarEnv env)
      throws Failure {
        if (!inLoop) {
            ctxt.report(new Failure("continue can only be used in a loop"));
        }
        def.returns = false;
        return env; // Return the input environment unchanged.
    }

    /** Generate code for executing this statement.
     */
    public void compile(Assembly a, int pushed) {
        String continueTo = a.newLabel();
        a.emit("jmp", continueTo);
        stack.push(continueTo);
    }
}
