public class And extends Exp {
    public final Exp e1;
    public final Exp e2;

    public And(Exp e1, Exp e2) {
        super();
        this.e1 = e1;
        this.e2 = e2;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}
