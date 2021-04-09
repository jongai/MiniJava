public class While extends Statement {
	private Exp e;
	private Statement s;

	public While(Exp e, Statement s) {
		super();
		this.e = e;
		this.s = s;
	}
}
