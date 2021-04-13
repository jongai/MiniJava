public class IdentifierType extends Type {
	public final String s;

	public IdentifierType(String s) {
		super();
		this.s = s;
	}
	
	public void accept(Visitor v) {
        v.visit(this);
    }
}
