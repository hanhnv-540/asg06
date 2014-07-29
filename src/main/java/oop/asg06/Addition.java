package oop.asg06;

public class Addition extends BinaryExpression {
	
	private Expression left;
	private Expression right;
	
	public Addition(Expression l, Expression r){
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
		String str = "(" + left.toString() + " + " + right.toString() + ")";
		return str;
	}

	public int evaluate() {
		return left.evaluate() + right.evaluate();
	}
}