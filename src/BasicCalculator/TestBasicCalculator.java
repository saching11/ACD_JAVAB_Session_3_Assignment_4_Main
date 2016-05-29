package BasicCalculator;

import java.util.Scanner;

public class TestBasicCalculator extends BasicCalculator {
	
	public static void main(String[] args) {
		
		TestBasicCalculator tbc = new TestBasicCalculator();
		System.out.println("Enter the first number ");
		Scanner sc = new Scanner(System.in);
		
		tbc.setNumber1(sc.nextInt());
		System.out.println("Enter the second number");
		tbc.setNumber2(sc.nextInt());
		System.out.println("Enter the operation you want to perform : \n+,-,*,/ ");
		char op = sc.next(".").charAt(0);
		
		switch(op) {
		
		case '+': System.out.println("Addition of "+ tbc.getNumber1() + "+" + tbc.getNumber2() + " is \n" + tbc.add());
					break;
		case '-': System.out.println("Addition of "+ tbc.getNumber1() + "+" + tbc.getNumber2() + " is \n" + tbc.sub());
					break;
		case '*': System.out.println("Addition of "+ tbc.getNumber1() + "+" + tbc.getNumber2() + " is \n" + tbc.mul());
					break;
		case '/': System.out.println("Addition of "+ tbc.getNumber1() + "+" + tbc.getNumber2() + " is \n" + tbc.div());
					break;
		default : System.out.println("You Entered Wrong Operation!");
					break;
		
		}
		
		
	}

}
