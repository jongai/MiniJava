public class Call extends Exp {
	private Exp e;
	private Identifier i;
	private ExpList el;

	public Call(Exp e, Identifier i, ExpList el) {
		super();
		this.e = e;
		this.i = i;
		this.el = el;
	}
}
