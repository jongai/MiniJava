public class ClassDeclExtends extends ClassDecl {
	private Identifier i;
	private Identifier j;
	private VarDeclList vl;
	private MethodDeclList ml;

	public ClassDeclExtends(Identifier i, Identifier j, VarDeclList vl, MethodDeclList ml) {
		super();
		this.i = i;
		this.j = j;
		this.vl = vl;
		this.ml = ml;
	}
}
