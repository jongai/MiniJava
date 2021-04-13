public class MethodDecl extends Node {
	public final Type t;
	public final Identifier i;
	public final FormalList fl;
	public final VarDeclList vl;
	public final StatementList sl;
	public final Exp e;

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
