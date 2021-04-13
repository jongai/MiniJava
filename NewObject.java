public class NewObject extends Exp {
    public final Identifier i;

	public NewObject(Identifier i) {
		super();
		this.i = i;
	}
	
	public void accept(Visitor v) {
        v.visit(this);
    }
}
