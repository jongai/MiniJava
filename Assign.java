public class Assign extends Statement {
	public final Identifier i;
	public final Exp e;

	public Assign(Identifier i, Exp e) {
		super();
		this.i = i;
		this.e = e;
	}
}
