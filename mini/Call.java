package mini;

import compiler.*;
import compiler.Failure;

/**
 * Represents a function call.
 */
class Call extends Expr {
    private Id name;
    private Args args;

    Call(Id name, Args args) {
        this.name = name;
        this.args = args;
    }

    /**
     * Return the type of value that will be produced when this
     * expression is evaluated.
     */
    public Type typeOf(Context ctxt, VarEnv env)
            throws Failure {
        Type result = typeCall(ctxt, env);
        if (result == null) {
            throw new Failure("Function " + name + " does not return a value");
        }
        return result;
    }

    /**
     * Type check a function call, returning either the return type
     * or null if this is a void function.
     */
    Type typeCall(Context ctxt, VarEnv env)
            throws Failure {
        // Look for the definition of this function
        Fundef def = ctxt.find(name);
        if (def == null) {
            throw new Failure("Cannot find function \"" + name + "\"");
        }
        return def.checkCall(args, ctxt, env);
    }

    /**
     * Type check this expression in places where it is used as a statement.
     * We override this method in Call to deal with methods that
     * return void.
     */
    void checkExpr(Context ctxt, VarEnv env)
            throws Failure {
        typeCall(ctxt, env);
    }

    /**
     * Return the depth of this expression as a measure of how complicated
     * the expression is / how many registers will be needed to evaluate it.
     */
    int getDepth() {
        // Possible side effects due to assignment, so do not change order.
        return DEEP;
    }

    /**
     * Generate assembly language code for this expression that will
     * evaluate the expression when it is executed and leave the result
     * in the specified free register, preserving any lower numbered
     * registers in the process.
     */

    public void compileExpr(Assembly a, int pushed, int free) {
            int varBytes = 0;

            Args tmp = args;

            for (; tmp!=null; tmp=args.getRest()){
                if (tmp.isByRef() && !(tmp.getArg() instanceof Id) )
                    varBytes += Assembly.WORDSIZE * tmp.getArg().getDepth();
            }

            // spill registers if necessary
            pushed += a.spillAll(free);

            // calculate number of argument bytes to be pushed
            int argBytes = Args.argBytes(args) + varBytes;


            // calculate   appropriate stack alignment
            int adjust = a.alignmentAdjust(argBytes + pushed);

            // reserve the necessary space on the stack
            a.insertAdjust(argBytes + adjust);

            // evaluate args and save results on the stack
            Args.compileArgs(a, argBytes + adjust + pushed, args);

            // do function call and move result into free
            a.call(name.toString(), free);

            // remove parameters and alignment adjustment from the stack
            a.removeAdjust(argBytes + adjust);

            // recover spilled registers
            a.unspillAll(free);

    }
}