public class IdentifierExp extends Exp {
	public final String s;

	public IdentifierExp(String s) {
		super();
		this.s = s;
	}
	
	public void accept(Visitor v) {
        v.visit(this);
    }
}
