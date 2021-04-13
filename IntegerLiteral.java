public class IntegerLiteral extends Exp {
	public final int i;

	public IntegerLiteral(int i) {
		super();
		this.i = i;
	}
	
	public void accept(Visitor v) {
        v.visit(this);
    }
}
