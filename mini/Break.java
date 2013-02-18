package mini;

import compiler.*;
import compiler.Failure;

import java.util.Stack;

/** Abstract syntax for break statements.
 */
class Break extends Stmt {
    static Stack<String> stack = new Stack<String>();


    /** Check that this statement is valid, taking the current environment
     *  as an argument and returning a possibly modified environment as a
     *  result.
     */
    public VarEnv check(Fundef def, Context ctxt, boolean inLoop, VarEnv env)
      throws Failure {
        if (!inLoop) {
            ctxt.report(new Failure("break can only be used in a loop"));
        }
        def.returns = false;
        return env; // Return the input environment unchanged.
    }

    /** Generate code for executing this statement.
     */
    public void compile(Assembly a, int pushed) {
        String breakTo = a.newLabel();
        a.emit("jmp", breakTo);
        stack.push(breakTo);
    }
}
