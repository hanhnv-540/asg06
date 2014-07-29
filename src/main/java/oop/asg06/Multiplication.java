package oop.asg06;

public class Multiplication extends BinaryExpression {
	
	private Expression left;
	private Expression right;
	
	public Multiplication(Expression l, Expression r){
		this.left = l;
		this.right = r;
	}
	
	public Expression left(){
		return left;
	}
	
	public Expression right(){
		return right;
	}
	
	public String toString() {
		String str = "(" + left.toString() + " * " + right.toString() + ")";
		return str;
	}

	public int evaluate() {
		return left.evaluate() * right.evaluate();
	}
}