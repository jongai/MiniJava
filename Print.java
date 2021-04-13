public class Print extends Statement {
    public final Exp e;

	public Print(Exp e) {
		super();
		this.e = e;
	}
	
	public void accept(Visitor v) {
        v.visit(this);
    }
}
