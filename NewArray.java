public class NewArray extends Exp {
    public final Exp e;

	public NewArray(Exp e) {
		super();
		this.e = e;
	}
	
	public void accept(Visitor v) {
        v.visit(this);
    }
}
