public class PrettyPrintVisitor2 implements Visitor {
    private static int ind = 0;

    public void sp(Node n) {
        for (int i = 0; i < ind; i++) {
            System.out.print("  ");
        }
        System.out.println(n.getClass().getName());
        ind++;
    }

    // MainClass m;
    // ClassDeclList cl;
    public void visit(Program n) {
        sp(n);
        n.m.accept(this);
        sp(n.cl);
        for (int i = 0; i < n.cl.size(); i++) {
            n.cl.elementAt(i).accept(this);
        }
        ind--;
        ind--;
    }

    // Identifier i1,i2;
    // Statement s;
    public void visit(MainClass n) {
        sp(n);
        n.i1.accept(this);
        n.i2.accept(this);
        n.s.accept(this);
        ind--;
    }

    // Identifier i;
    // VarDeclList vl;
    // MethodDeclList ml;
    public void visit(ClassDeclSimple n) {
        sp(n);
        n.i.accept(this);
        sp(n.vl);
        for (int i = 0; i < n.vl.size(); i++) {
            n.vl.elementAt(i).accept(this);
            if (i + 1 < n.vl.size()) {
            }
        }
        ind--;
        sp(n.ml);
        for (int i = 0; i < n.ml.size(); i++) {
            n.ml.elementAt(i).accept(this);
        }
        ind--;
        ind--;
    }

    // Identifier i;
    // Identifier j;
    // VarDeclList vl;
    // MethodDeclList ml;
    public void visit(ClassDeclExtends n) {
        sp(n);
        n.i.accept(this);
        n.j.accept(this);
        sp(n.vl);
        for (int i = 0; i < n.vl.size(); i++) {
            n.vl.elementAt(i).accept(this);
            if (i + 1 < n.vl.size()) {
            }
        }
        ind--;
        sp(n.ml);
        for (int i = 0; i < n.ml.size(); i++) {
            n.ml.elementAt(i).accept(this);
        }
        ind--;
        ind--;
    }

    // Type t;
    // Identifier i;
    public void visit(VarDecl n) {
        sp(n);
        n.t.accept(this);
        n.i.accept(this);
        ind--;
    }

    // Type t;
    // Identifier i;
    // FormalList fl;
    // VarDeclList vl;
    // StatementList sl;
    // Exp e;
    public void visit(MethodDecl n) {
        sp(n);
        n.t.accept(this);
        n.i.accept(this);
        sp(n.fl);
        for (int i = 0; i < n.fl.size(); i++) {
            n.fl.elementAt(i).accept(this);
            if (i + 1 < n.fl.size()) {
            }
        }
        ind--;
        sp(n.vl);
        for (int i = 0; i < n.vl.size(); i++) {
            n.vl.elementAt(i).accept(this);
        }
        ind--;
        sp(n.sl);
        for (int i = 0; i < n.sl.size(); i++) {
            n.sl.elementAt(i).accept(this);
            if (i < n.sl.size()) {
            }
        }
        ind--;
        n.e.accept(this);
        ind--;
    }

    // Type t;
    // Identifier i;
    public void visit(Formal n) {
        sp(n);
        n.t.accept(this);
        n.i.accept(this);
        ind--;
    }

    public void visit(IntArrayType n) {
        sp(n);
        ind--;
    }

    public void visit(BooleanType n) {
        sp(n);
        ind--;
    }

    public void visit(IntegerType n) {
        sp(n);
        ind--;
    }

    // String s;
    public void visit(IdentifierType n) {
        sp(n);
        ind--;
    }

    // StatementList sl;
    public void visit(Block n) {
        sp(n);
        sp(n.sl);
        for (int i = 0; i < n.sl.size(); i++) {
            n.sl.elementAt(i).accept(this);
        }
        ind--;
        ind--;
    }

    // Exp e;
    // Statement s1,s2;
    public void visit(If n) {
        sp(n);
        n.e.accept(this);
        n.s1.accept(this);
        n.s2.accept(this);
        ind--;
    }

    // Exp e;
    // Statement s;
    public void visit(While n) {
        sp(n);
        n.e.accept(this);
        n.s.accept(this);
        ind--;
    }

    // Exp e;
    public void visit(Print n) {
        sp(n);
        n.e.accept(this);
        ind--;
    }

    // Identifier i;
    // Exp e;
    public void visit(Assign n) {
        sp(n);
        n.i.accept(this);
        n.e.accept(this);
        ind--;
    }

    // Identifier i;
    // Exp e1,e2;
    public void visit(ArrayAssign n) {
        sp(n);
        n.i.accept(this);
        n.e1.accept(this);
        n.e2.accept(this);
        ind--;
    }

    // Exp e1,e2;
    public void visit(And n) {
        sp(n);
        n.e1.accept(this);
        n.e2.accept(this);
        ind--;
    }

    // Exp e1,e2;
    public void visit(LessThan n) {
        sp(n);
        n.e1.accept(this);
        n.e2.accept(this);
        ind--;
    }

    // Exp e1,e2;
    public void visit(Plus n) {
        sp(n);
        n.e1.accept(this);
        n.e2.accept(this);
        ind--;
    }

    // Exp e1,e2;
    public void visit(Minus n) {
        sp(n);
        n.e1.accept(this);
        n.e2.accept(this);
        ind--;
    }

    // Exp e1,e2;
    public void visit(Times n) {
        sp(n);
        n.e1.accept(this);
        n.e2.accept(this);
        ind--;
    }

    // Exp e1,e2;
    public void visit(ArrayLookup n) {
        sp(n);
        n.e1.accept(this);
        n.e2.accept(this);
        ind--;
    }

    // Exp e;
    public void visit(ArrayLength n) {
        sp(n);
        n.e.accept(this);
        ind--;
    }

    // Exp e;
    // Identifier i;
    // ExpList el;
    public void visit(Call n) {
        sp(n);
        n.e.accept(this);
        n.i.accept(this);
        sp(n.el);
        for (int i = 0; i < n.el.size(); i++) {
            n.el.elementAt(i).accept(this);
            if (i + 1 < n.el.size()) {
            }
        }
        ind--;
        ind--;
    }

    // int i;
    public void visit(IntegerLiteral n) {
        sp(n);
        ind--;
    }

    public void visit(True n) {
        sp(n);
        ind--;
    }

    public void visit(False n) {
        sp(n);
        ind--;
    }

    // String s;
    public void visit(IdentifierExp n) {
        sp(n);
        ind--;
    }

    public void visit(This n) {
        sp(n);
        ind--;
    }

    // Exp e;
    public void visit(NewArray n) {
        sp(n);
        n.e.accept(this);
        ind--;
    }

    // Identifier i;
    public void visit(NewObject n) {
        sp(n);
        ind--;
    }

    // Exp e;
    public void visit(Not n) {
        sp(n);
        n.e.accept(this);
        ind--;
    }

    // String s;
    public void visit(Identifier n) {
        sp(n);
        ind--;
    }
}