import java.util.Vector;

public class MethodDeclList extends Node {
	private Vector<MethodDecl> list;
	public MethodDeclList() {
		super();
		list = new Vector<MethodDecl>();
	}
	public void addElement(MethodDecl n) {
		list.addElement(n);
	}
	public MethodDecl elementAt(int i) {
		return list.elementAt(i);
	}
	public int size() {
		return list.size();
	}
}
