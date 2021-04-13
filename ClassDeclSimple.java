public class ClassDeclSimple extends ClassDecl {
	public final Identifier i;
	public final VarDeclList vl;
	public final MethodDeclList ml;

	public ClassDeclSimple(Identifier i, VarDeclList vl, MethodDeclList ml) {
		super();
		this.i = i;
		this.vl = vl;
		this.ml = ml;
	}
}
