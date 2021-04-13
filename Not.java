public class Not extends Exp {
    public final Exp e;

	public Not(Exp e) {
		super();
		this.e = e;
	}
	
	public void accept(Visitor v) {
        v.visit(this);
    }
}
