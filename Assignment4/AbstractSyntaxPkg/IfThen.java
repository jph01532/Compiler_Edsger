package AbstractSyntaxPkg;
import VisitorPkg.*;

public class IfThen extends Stmt {
  public Expr cond;
  public Stmt stmt;

  public IfThen( Expr acond, Stmt astmt) {
    cond = acond;
    stmt = astmt;
  }

  public void accept(Visitor v) {
    v.visit(this);
  }

  public Object accept(ValueVisitor v) {
    return v.visit(this);
  }
}
