public class Identifier extends Node {
	public final String s;

	public Identifier(String s) {
		super();
		this.s = s;
	}

	public String toString() {
		return s;
	}
	
	public void accept(Visitor v) {
        v.visit(this);
    }
}
