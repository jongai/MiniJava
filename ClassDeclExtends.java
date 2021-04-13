public class ClassDeclExtends extends ClassDecl {
	public final Identifier i;
	public final Identifier j;
	public final VarDeclList vl;
	public final MethodDeclList ml;

	public ClassDeclExtends(Identifier i, Identifier j, VarDeclList vl, MethodDeclList ml) {
		super();
		this.i = i;
		this.j = j;
		this.vl = vl;
		this.ml = ml;
	}
}
