public class While extends Statement {
	public final Exp e;
	public final Statement s;

	public While(Exp e, Statement s) {
		super();
		this.e = e;
		this.s = s;
	}
}
