package oop.asg06;

public class Square extends Expression {
	
	Expression expression;
	
	public Square(Expression expression){
		this.expression = expression;
	}
	
	
	public int evaluate(){
		return expression.evaluate() * expression.evaluate();
	}
	
	public String toString() {
	String str =""+ expression.toString() + "^2";
	return str;
	}
}