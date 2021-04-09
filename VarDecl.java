public class VarDecl extends Node {
	private Type t;
	private Identifier i;

	public VarDecl(Type t, Identifier i) {
		super();
		this.t = t;
		this.i = i;
	}
}
