public class ArrayAssign extends Statement {
	private Identifier i;
	private Exp e1;
	private Exp e2;

	public ArrayAssign(Identifier i, Exp e1, Exp e2) {
		super();
		this.i = i;
		this.e1 = e1;
		this.e2 = e2;
	}
}
