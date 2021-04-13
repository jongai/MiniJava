public class ArrayAssign extends Statement {
	public final Identifier i;
	public final Exp e1;
	public final Exp e2;

	public ArrayAssign(Identifier i, Exp e1, Exp e2) {
		super();
		this.i = i;
		this.e1 = e1;
		this.e2 = e2;
	}
	
	public void accept(Visitor v) {
        v.visit(this);
    }
}
