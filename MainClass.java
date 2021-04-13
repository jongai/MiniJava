public class MainClass extends Node {
	public final Identifier i1;
	public final Identifier i2;
	public final Statement s;

	public MainClass(Identifier i1, Identifier i2, Statement s) {
		super();
		this.i1 = i1;
		this.i2 = i2;
		this.s = s;
	}
	
	public void accept(Visitor v) {
        v.visit(this);
    }
}
