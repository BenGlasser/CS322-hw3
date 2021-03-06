package mini;

import compiler.*;
import compiler.Failure;

/** Represents a list of expressions passed as the arguments to a
 *  function call.
 */
class Args {
    /** Holds this argument expression.
     */
    private Expr arg;

    /** A flag, set during static analysis, to indicate if this
     *  parameter should be passed by reference.
     */
    private boolean byRef = false;

    /** Points to the list containing the rest of the arguments.
     */
    private Args rest;

    Args(Expr arg, Args rest) {
        this.arg = arg;
        this.rest = rest;

    }

    /** Return the argument at the front of this list.
     */
    public Expr getArg() {
        return arg;
    }

    /** Return a flag to indicate if this is a by-reference argument.
     */
    public boolean isByRef() {
        return byRef;
    }

    /** Set flag to indicate that this is a by-reference argument.
     */
    public void setByRef(boolean byRef) {
        this.byRef = byRef;
    }

    /** Return a list containing the rest of the function's arguments.
     */
    public Args getRest() {
        return rest;
    }

    /** Calculate the number of bytes of stack space that will be required to
     *  store the values of the arguments in this list.
     */
    static int argBytes(Args args) {
        int bytes = 0;
        for (; args!=null; args=args.rest) {
            bytes += Assembly.WORDSIZE;
        }
        return bytes;
    }

    /** Generate code to evaluate each of the arguments in the given list
     *  and save the results on the stack.
     */
    static void compileArgs(Assembly a, int pushed, Args args) {
        int valueSpace = argBytes(args);
        for (int offset=0; args!=null; args=args.rest) {
            if (args.isByRef()){
                a.emit("#COMPILE ARGS--------------------------------------");
                //args.arg.compileExpr(a, pushed, 0);                   //compile arg
                if (args.getArg() instanceof Id)
                    args.arg.compileRefToStack(a, pushed, 0, offset, ((Id) args.getArg()).getVe().getOffset());
                else{
                    // compile this argument, writing final value on the stack
                    args.arg.compileToStack(a, pushed, 0, offset + valueSpace);
                    //args.arg.compileRefToStack(a, pushed, 0, offset + Assembly.WORDSIZE, offset);
                    a.emit("movl", "%esp", a.reg(0));              // a.reg(free) now holds mem addy of ebp4
                    a.emit("addl", a.immed(offset + valueSpace), a.reg(0));     // add offset of arg location
                    a.emit("movl", a.reg(0), a.indirect(offset, "%esp"));   // now we want to push the addy on the stack.
                }

                a.emit("#--------------------------------------------------");

            }
            else
                // compile this argument, writing final value on the stack
                args.arg.compileToStack(a, pushed, 0, offset);
            // compute the offset for the next argument
            offset += Assembly.WORDSIZE;
        }
    }
}
