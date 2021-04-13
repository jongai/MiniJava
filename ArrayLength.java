public class ArrayLength extends Exp {
	public final Exp e;

	public ArrayLength(Exp e) {
		super();
		this.e = e;
	}
	
	public void accept(Visitor v) {
        v.visit(this);
    }
}
