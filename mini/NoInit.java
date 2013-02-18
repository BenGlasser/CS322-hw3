package mini;

import compiler.Failure;

public class NoInit extends ForInit {
    /** Check that this for initializer is valid, returning the
     *  variable environment after the initializer has run, which
     *  may have added new entries if the initializer introduces
     *  local variables (i.e., the VarDeclInit case).
     */
    public VarEnv check(Fundef def, Context ctxt, VarEnv env)
      throws Failure {
        return env;
    }

    /** Generate code for executing this for loop initializer.
     */
    public void compile(Assembly a, int pushed) {
        return;  // no init so nothing to do.
    }
}
