public class Assign extends Statement {
	private Identifier i;
	private Exp e;

	public Assign(Identifier i, Exp e) {
		super();
		this.i = i;
		this.e = e;
	}
}
