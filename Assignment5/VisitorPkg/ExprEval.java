package VisitorPkg;

import AbstractSyntaxPkg.*;
import ParsePkg.*;
import java.util.HashMap;

public class ExprEval implements ValueVisitor {
	
	HashMap<STring, Object> symTable;

	public ExprEval(HashMap<String, Object> symTable){
		this.symTable = symTable;
	}

  	public Object visit(Program n){}
	public Object visit(VarDecl n){}
  	public Object visit(FunDef n){}
  	public Object visit(GCommand n){}
  	public Object visit(IntType n){}
  	public Object visit(BoolType n){}
  	public Object visit(IntArrayType n){}
  	public Object visit(BoolArrayType n){}
  	public Object visit(CompoundStmt n){}
  	public Object visit(Assign n){}
  	public Object visit(If n){}
  	public Object visit(IfThen n){}
  	public Object visit(Do n){}
  	public Object visit(Skip n){}
  	public Object visit(Display n){}
  	public Object visit(FunCallStmt n){}
  	public Object visit(Plus n){}
  	public Object visit(Minus n){}
  	public Object visit(Times n){}
  	public Object visit(Div n){}
  	public Object visit(Neg n){}
  	public Object visit(Num n){}
  	public Object visit(Equal n){}
  	public Object visit(NotEqual n){}
  	public Object visit(LessThan n){}
  	public Object visit(LessEqual n){}
  	public Object visit(GreaterThan n){}
  	public Object visit(GreaterEqual n){}
  	public Object visit(Not n){}
  	public Object visit(And n){}
  	public Object visit(Or n){}
  	public Object visit(True n){}
  	public Object visit(False n){}
  	public Object visit(Id n){}
  	public Object visit(ArrayElt n){}
  	public Object visit(FunCallExpr n){}
	

}
