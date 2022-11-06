package com.lab3.q1.balancingbrackets;

public class BalancingBrackets {

	String expression;
	Character[] brac;

	public boolean BalancingBracketsImplementation() {

		int len = expression.length();
		brac = new Character[len];

		for (int j = 0; j < brac.length; j++) {
			brac[j] = expression.charAt(j);
		}

		return ifBalanced();
	}

	BalancingBrackets(String expression) {
		this.expression = expression;
	}

	public boolean ifBalanced() {

		Stacks stack = new Stacks();

		if (brac.length % 2 != 0) {
			return false;
		} else {
			for (int i = 0; i < brac.length; i++) {
				if (brac[i] == '{' || brac[i] == '[' || brac[i] == '(') {
					stack.push(brac[i]);
					continue;
				}
				if (stack.isEmpty()) {
					return false;
				}
				char check;
				switch (brac[i]) {
				case ')':
					check = stack.pop();
					if (check == '{' || check == '[')
						return false;
					break;

				case '}':
					check = stack.pop();
					if (check == '(' || check == '[')
						return false;
					break;

				case ']':
					check = stack.pop();
					if (check == '(' || check == '{')
						return false;
					break;
				}
			}
		}
		return (stack.isEmpty());
	}
}
