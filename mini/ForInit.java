package mini;

import compiler.Failure;

public abstract class ForInit {
    /** Check that this for initializer is valid, returning the
     *  variable environment after the initializer has run, which
     *  may have added new entries if the initializer introduces
     *  local variables (i.e., the VarDeclInit case).
     */
    public abstract VarEnv check(Fundef def, Context ctxt, VarEnv env)
      throws Failure;

    /** Generate code for executing this for loop initializer.
     */
    public abstract void compile(Assembly a, int pushed);
}
