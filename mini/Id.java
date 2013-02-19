package mini;

import compiler.Failure;

/** Abstract syntax for identifiers/variables.
 */
class Id extends Expr {
    String name;
    Id(String name) {
        this.name = name;
    }

    /** Generate a printable description of this identifier.
     */
    public String toString() {
        return name;
    }

    /** Test to see if two identifiers have the same name.
     */
    public boolean equals(Id that) {
        return this.name.equals(that.name);
      }

    private VarEnv ve = null;

    /** Return the type of value that will be produced when this
     *  expression is evaluated.
     */
    public Type typeOf(Context ctxt, VarEnv env)
      throws Failure {
        ve = VarEnv.find(this, env);
        if (getVe() ==null) {
          throw new Failure("The variable " + name + " is not in scope");
        }
        return getVe().getType();
    }

    /** Return the depth of this expression as a measure of how complicated
     *  the expression is / how many registers will be needed to evaluate it.
     */
    int getDepth() {
        return 1;
    }

    /** Return a string that specifies the location in memory
     *  where this variable is stored.
     */
    String fromStackFrame(Assembly a) {
        return a.varRef(getVe());
    }

    /** Generate assembly language code for this expression that will
     *  evaluate the expression when it is executed and leave the result
     *  in the specified free register, preserving any lower numbered
     *  registers in the process.
     */
    public void compileExpr(Assembly a, int pushed, int free) {
        if (this.getVe().isByRef()){
            a.spill(free+1);
            a.emit("\n# callByRef ID  value*****************************");
            a.emit("movl", a.indirect(this.ve.getOffset(), "%ebp"), a.reg(free + 1));   // load addy from stack to register
            a.emit("movl", a.indirect(0,a.reg(free+1)), a.reg(free));  // load value at that address into register
            a.emit("#--------------------------------------------------\n");
            a.unspill(free+1);
        }
        else
            a.emit("movl", this.fromStackFrame(a), a.reg(free));
    }

    /** Record the environment for this variable so that
     *  we can access its details during code generation.
     */
    public VarEnv getVe() {
        return ve;
    }
}
