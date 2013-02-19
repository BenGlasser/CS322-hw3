package mini;

import compiler.*;
import compiler.Failure;

/** Abstract syntax for expressions.
 */
public abstract class Expr {

    /** Return the type of value that will be produced when this
     *  expression is evaluated.
     */
    public abstract Type typeOf(Context ctxt, VarEnv env)
      throws Failure;

    /** Type check this expression in places where it is used as a statement.
     *  We override this method in Call to deal with methods that
     *  return void.
     */
    void checkExpr(Context ctxt, VarEnv env)
      throws Failure { typeOf(ctxt, env); }

    /** Return the depth of this expression as a measure of how complicated
     *  the expression is / how many registers will be needed to evaluate it.
     */
    abstract int getDepth();

    /** Used as a depth value to indicate an expression that has a
     *  potential side effect, and hence requires order of evaluation
     *  to be preserved.  (The same depth value could, in theory, be
     *  produced as the depth of a stunningly complex but side-effect
     *  free expression; oh well, we'll just miss the attempt to
     *  minimize register usage in such (highly unlikely) cases. :-)
     */
    public static final int DEEP = 1000;

    /** Generate assembly language code for this expression that will
     *  evaluate the expression when it is executed and leave the result
     *  in the specified free register, preserving any lower numbered
     *  registers in the process.
     */
    public abstract void compileExpr(Assembly a, int pushed, int free);

    /** Generate assembly language code to evaluate this expression and
     *  write the resulting value into the stack at the specified offset.
     */
    public void compileToStack(Assembly a, int pushed, int free, int offset) {
        compileExpr(a, pushed, free);
        a.emit("movl", a.reg(free), a.indirect(offset, "%esp"));
    }
    public void compileRefToStack(Assembly a, int pushed, int free, int offset) {
        compileExpr(a, pushed, free);
        a.emit("movl", a.indirect(offset, "%esp"), a.reg(free+1));    // a.reg(free+1) now hold mem addy of esp at offset
        a.emit("movl", a.reg(free), a.indirect(0, a.reg(free+1)));    // now we want to store the value of the compilation in that addy.
    }

    /** Generate code that will evaluate this (boolean-valued) expression
     *  and jump to the specified label if the result is true.
     */
    void branchTrue(Assembly a, int pushed, int free, String lab) {
        compileExpr(a, pushed, free);
        a.emit("orl", a.reg(free), a.reg(free));
        a.emit("jnz", lab);
    }

    /** Generate code that will evaluate this (boolean-valued) expression
     *  and jump to the specified label if the result is false.
     */
    void branchFalse(Assembly a, int pushed, int free, String lab) {
        compileExpr(a, pushed, free);
        a.emit("orl", a.reg(free), a.reg(free));
        a.emit("jz", lab);
    }
}
