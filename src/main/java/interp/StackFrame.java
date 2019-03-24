package interp;

public class StackFrame {
    FunctionSymbol sym; // associated with which function?
    int returnAddress;  // the instruction following the call
    Object[] locals;    // holds parameters and local variables

    public StackFrame(FunctionSymbol sym, int returnAddress) {
        this.sym = sym;
        this.returnAddress = returnAddress;
        locals = new Object[sym.nargs + sym.nlocals];
    }
}
