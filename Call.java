public class Call extends Exp {
	public final Exp e;
	public final Identifier i;
	public final ExpList el;

	public Call(Exp e, Identifier i, ExpList el) {
		super();
		this.e = e;
		this.i = i;
		this.el = el;
	}
}
