import java.util.Vector;

public class StatementList extends Node {
    private Vector<Statement> list;

    public StatementList() {
        super();
        list = new Vector<Statement>();
    }

    public void addElement(Statement n) {
        list.addElement(n);
    }

    public Statement elementAt(int i) {
        return list.elementAt(i);
    }

    public int size() {
        return list.size();
    }

    public void accept(Visitor v) {
    }
}
