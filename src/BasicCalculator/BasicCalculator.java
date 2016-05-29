package BasicCalculator;

public class BasicCalculator {
	
	private int number1,number2;

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	
	public int getNumber1() {
		return number1;
	}

	public int getNumber2() {
		return number2;
	}
	
	protected int add() {
		return this.number1+this.number2;
	}
	
	protected int sub() {
		return this.number1-this.number2;
	}
	
	protected int mul() {
		return this.number1*this.number2;
	}
	
	protected int div() {
		return this.number1/this.number2;
	}

}
