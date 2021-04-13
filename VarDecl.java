public class VarDecl extends Node {
    public final Type t;
    public final Identifier i;

	public VarDecl(Type t, Identifier i) {
		super();
		this.t = t;
		this.i = i;
	}
	
	public void accept(Visitor v) {
        v.visit(this);
    }
}
