package mini;

import compiler.*;
import compiler.Failure;

/** Represents a single formal parameter in a function definition,
 *  pairing a type (or null, for a void function that does not
 *  return an argument).
 */
class Formal {

    /** Holds the type of this formal parameter.
     */
    private Type type;

    /** Holds the name of this formal parameter.
     */
    private Id name;

    /** A flag to indicate if this parameter should be passed by reference.
     */
    private boolean byRef;

    Formal(Type type, Id name, boolean byRef) {
        this.type  = type;
        this.name  = name;
        this.byRef = byRef;
    }

    /** Return the type of this formal parameter.
     */
    public Type getType() {
        return type;
    }

    /** Return the name of this formal parameter.
     */
    public Id getName() {
        return name;
    }

    /** Return a flag to indicate if this is a by-reference parameter.
     */
    public boolean isByRef() {
        return byRef;
    }

    /** Generate a printable description of this formal parameter.
     */
    public String toString() {
        return name.toString();
    }

    /** Construct an environment that adds this formal parameter
     *  with a specified stack frame offset.
     */
    VarEnv extendEnv(int offset, VarEnv env) {
        return new VarEnv(name, type, offset, byRef, env);
    }
}
