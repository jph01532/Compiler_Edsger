package AbstractSyntaxPkg;

import VisitorPkg.Visitor;

public class Plus extends Expr {
  public Expr e1, e2;

  public Plus(Expr ae1, Expr ae2) { 
    e1=ae1; e2=ae2;
  }

  public void accept(Visitor v) {
    v.visit(this);
  }
}
