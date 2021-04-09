public class ClassDeclSimple extends ClassDecl {
	private Identifier i;
	private VarDeclList vl;
	private MethodDeclList ml;

	public ClassDeclSimple(Identifier i, VarDeclList vl, MethodDeclList ml) {
		super();
		this.i = i;
		this.vl = vl;
		this.ml = ml;
	}
}
