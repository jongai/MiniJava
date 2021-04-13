import java.util.Vector;

public class FormalList extends Node {
    private Vector<Formal> list;

    public FormalList() {
        super();
        list = new Vector<Formal>();
    }

    public void addElement(Formal n) {
        list.addElement(n);
    }

    public Formal elementAt(int i) {
        return list.elementAt(i);
    }

    public int size() {
        return list.size();
    }

    public void accept(Visitor v) {
    }
}
