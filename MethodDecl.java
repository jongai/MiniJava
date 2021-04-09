public class MethodDecl extends Node {
	private Type t;
	private Identifier i;
	private FormalList fl;
	private VarDeclList vl;
	private StatementList sl;
	private Exp e;

	public MethodDecl(Type t, Identifier i, FormalList fl, VarDeclList vl, StatementList sl, Exp e) {
		super();
		this.t = t;
		this.i = i;
		this.fl = fl;
		this.vl = vl;
		this.sl = sl;
		this.e = e;
	}
}
