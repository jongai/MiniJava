public class If extends Statement {
	public final Exp e;
	public final Statement s1;
	public final Statement s2;

	public If(Exp e, Statement s1, Statement s2) {
		super();
		this.e = e;
		this.s1 = s1;
		this.s2 = s2;
	}
	
	public void accept(Visitor v) {
        v.visit(this);
    }
}
