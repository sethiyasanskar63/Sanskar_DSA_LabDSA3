package com.lab3.q1.balancingbrackets;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// System.out.println("Enter the expression:");
		// String expression=sc.next();
		sc.close();

		String expression = "([()[]{}])";
		String expression1 = "([()[]{(})])";

		BalancingBrackets balacingbrackets = new BalancingBrackets(expression);

		if (balacingbrackets.BalancingBracketsImplementation()) {
			System.out.println("Given expression: " + balacingbrackets.expression);
			System.out.println("The entered String has Balanced Brackets.");
		} else {
			System.out.println("Given expression: " + balacingbrackets.expression);
			System.out.println("The entered String do not contain Balanced Brackets.");
		}

		BalancingBrackets balacingbrackets1 = new BalancingBrackets(expression1);

		if (balacingbrackets1.BalancingBracketsImplementation()) {
			System.out.println("Given expression: " + balacingbrackets1.expression);
			System.out.println("The entered String has Balanced Brackets.");
		} else {
			System.out.println("Given expression: " + balacingbrackets1.expression);
			System.out.println("The entered String do not contain Balanced Brackets.");
		}

	}

}
