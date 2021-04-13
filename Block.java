public class Block extends Statement {
	public final StatementList sl;

	public Block(StatementList sl) {
		super();
		this.sl = sl;
	}
	
	public void accept(Visitor v) {
        v.visit(this);
    }
}
