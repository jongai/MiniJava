public class Formal extends Node {
	public final Type t;
	public final Identifier i;

	public Formal(Type t, Identifier i) {
		super();
		this.t = t;
		this.i = i;
	}
}
