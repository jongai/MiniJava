public class If extends Statement {
	private Exp e;
	private Statement s1;
	private Statement s2;

	public If(Exp e, Statement s1, Statement s2) {
		super();
		this.e = e;
		this.s1 = s1;
		this.s2 = s2;
	}
}
