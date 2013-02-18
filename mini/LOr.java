package mini;

import compiler.*;
import compiler.Failure;

/** Abstract syntax for logical or expressions (||).
 */
class LOr extends BinLogicExpr {
    LOr(Expr left, Expr right) {
        super(left, right);
    }

    /** Generate assembly language code for this expression that will
     *  evaluate the expression when it is executed and leave the result
     *  in the specified free register, preserving any lower numbered
     *  registers in the process.
     */
    public void compileExpr(Assembly a, int pushed, int free) {
        String lab = a.newLabel();
        left.compileExpr(a, pushed, free);
        a.emit("orl", a.reg(free), a.reg(free));
        a.emit("jnz",  lab);
        right.compileExpr(a, pushed, free);
        a.emitLabel(lab);
    }

    /** Generate code that will evaluate this (boolean-valued) expression
     *  and jump to the specified label if the result is true.
     */
    void branchTrue(Assembly a, int pushed, int free, String lab) {
        left.branchTrue(a, pushed, free, lab);
        right.branchTrue(a, pushed, free, lab);
    }

    /** Generate code that will evaluate this (boolean-valued) expression
     *  and jump to the specified label if the result is false.
     */
    void branchFalse(Assembly a, int pushed, int free, String lab) {
        String lab1 = a.newLabel();
        left.branchTrue(a, pushed, free, lab1);
        right.branchFalse(a, pushed, free, lab);
        a.emitLabel(lab1);
    }
}
