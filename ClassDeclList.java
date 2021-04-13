import java.util.Vector;

public class ClassDeclList extends Node {
	private Vector<ClassDecl> list;
	public ClassDeclList() {
		super();
		list = new Vector<ClassDecl>();
	}
	public void addElement(ClassDecl n) {
		list.addElement(n);
	}
	public ClassDecl elementAt(int i) {
		return list.elementAt(i);
	}
	public int size() {
		return list.size();
	}
	
	public void accept(Visitor v) {
        v.visit(this);
    }
}
