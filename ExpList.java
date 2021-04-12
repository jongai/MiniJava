import java.util.Vector;

public class ExpList extends Node {
	private Vector<Exp> list;
	public ExpList() {
		super();
		list = new Vector<Exp>();
	}
	public void addElement(Exp n) {
		list.addElement(n);
	}
	public Exp elementAt(int i) {
		return list.elementAt(i);
	}
	public int size() {
		return list.size();
	}
}
