package mini;

import compiler.*;
import compiler.Failure;

/** Abstract syntax for assignment expressions.
 */
class Assign extends Expr {
    private Id lhs;
    private Expr rhs;
    Assign(Id lhs, Expr rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    /** Return the type of value that will be produced when this
     *  expression is evaluated.
     */
    public Type typeOf(Context ctxt, VarEnv env)
      throws Failure {
        Type lt = lhs.typeOf(ctxt, env);
        Type rt = rhs.typeOf(ctxt,env);
        if (!lt.equal(rt)) {
            ctxt.report(new Failure("Types in assignment do not match"));
        }
        return rt;
    }

    /** Return the depth of this expression as a measure of how complicated
     *  the expression is / how many registers will be needed to evaluate it.
     */
    int getDepth() {
        // Possible side effects due to assignment, so do not change order.
        return DEEP;
    }

    /** Generate assembly language code for this expression that will
     *  evaluate the expression when it is executed and leave the result
     *  in the specified free register, preserving any lower numbered
     *  registers in the process.
     */
    public void compileExpr(Assembly a, int pushed, int free) {
        rhs.compileExpr(a, pushed, free);
        if (lhs.getVe().isByRef()){
            a.spill(free+1);
            a.emit("\n# assign value*****************************");
            a.emit("movl", lhs.fromStackFrame(a), a.reg(free + 1));   // move address lhs reffers to into reg
            a.emit("movl", a.reg(free), a.indirect(0,a.reg(free+1))); // load rhs into that address
            a.emit("\n");
            a.unspill(free+1);
        }
        else                                           {
            a.emit("\n# assign value*****************************");
            a.emit("movl", a.reg(free), lhs.fromStackFrame(a));
            a.emit("\n");
        }
    }
}
