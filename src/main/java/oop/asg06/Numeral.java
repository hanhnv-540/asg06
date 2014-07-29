package oop.asg06;

public class Numeral extends Expression {
	
	private int value;
	
	public void setvalue(int v){
		value = v;
	}
	
	public int getvalue(){
		return value;
	}
	
	public Numeral(int value){
		this.value = value;
	}
	
	public String toString(){
		return "" + value;
	}
	
	public int evaluate(){
		return value;
	}
}