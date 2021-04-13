public class Program extends Node {
	public final MainClass m;
	public final ClassDeclList cl;

	public Program(MainClass m, ClassDeclList cl) {
		super();
		this.m = m;
		this.cl = cl;
	}
	
	public void accept(Visitor v) {
        v.visit(this);
    }
}
