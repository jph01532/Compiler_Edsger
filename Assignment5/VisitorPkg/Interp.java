package VisitorPkg;

import AbstractSyntaxPkg.*;
import ParsePkg.*;
import java.util.HashMap;

public class Interp implements Visitor
{
	HashMap<String, Object> symTable = new HashMap<String, Integer>();

	ValueVisitor eval = new ExprEval(symTable);

	public void visit(Program n){}
  	public void visit(VarDecl n){}
  	public void visit(FunDef n){}
  	public void visit(GCommand n){}
  	public void visit(IntType n){}
  	public void visit(BoolType n){}
  	public void visit(IntArrayType n){}
  	public void visit(BoolArrayType n){}
  	public void visit(CompoundStmt n){}
  	public void visit(Assign n){}
  	public void visit(If n){}
  	public void visit(IfThen n){}
  	public void visit(Do n){}
  	public void visit(Skip n){}
  	public void visit(Display n){}
  	public void visit(FunCallStmt n){}
  	public void visit(Plus n){}
  	public void visit(Minus n){}
  	public void visit(Times n){}
  	public void visit(Div n){}
  	public void visit(Neg n){}
  	public void visit(Num n){}
  	public void visit(Equal n){}
  	public void visit(NotEqual n){}
  	public void visit(LessThan n){}
  	public void visit(LessEqual n){}
  	public void visit(GreaterThan n){}
  	public void visit(GreaterEqual n){}
  	public void visit(Not n){}
  	public void visit(And n){}
  	public void visit(Or n){}
  	public void visit(True n){}
  	public void visit(False n){}
  	public void visit(Id n){}
  	public void visit(ArrayElt n){}
  	public void visit(FunCallExpr n){}

}