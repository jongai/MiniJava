public class Assign extends Statement {
	public final Identifier i;
	public final Exp e;

	public Assign(Identifier i, Exp e) {
		super();
		this.i = i;
		this.e = e;
	}
	
	public void accept(Visitor v) {
        v.visit(this);
    }
}
