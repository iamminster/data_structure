package io.github.iamminster.algorithm;

import io.github.iamminster.data_structure.stack.StackLL;

public class BasicAlgorithms {

	public BasicAlgorithms() {
		// TODO Auto-generated constructor stub
	}
	
	// ([])()[] : true
	// (((([([])]))))() : true
	// ([]]() : false
	// ][ : false
	public boolean isBalanced(String input) {
		if (input == null) {
			return false;
		}
		if (input.length() == 0) {
			return false;
		}
		
		StackLL stack = new StackLL();
		for (int i = 0; i < input.length(); ++i) {
			char inputChar = input.charAt(i);
			if (isCloseBracket(inputChar)) {
				if (stack.empty()) {
					return false;
				}
				char openBracket = (char) stack.pop();
				if (!isPair(openBracket, inputChar)) {
					return false;
				}
			} else {
				stack.push(inputChar);
			}
		}
		return stack.empty();
	}

	private boolean isCloseBracket(char ch) {
		String closeBrackets = "])";
		return closeBrackets.contains(Character.toString(ch));
	}
	
	private boolean isPair(char openBracket, char closeBracket) {
		String parentheses = "()";
		String squareBrackets = "[]";
		
		String pair = new StringBuilder().append(openBracket).append(closeBracket).toString();
		if (pair.equals(parentheses) || pair.equals(squareBrackets)) {
			return true;
		}
		return false;
	}
}
