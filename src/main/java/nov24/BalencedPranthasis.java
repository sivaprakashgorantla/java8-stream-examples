package nov24;

import java.util.Stack;

public class BalencedPranthasis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String brasis = "{[()]}";
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < brasis.length(); i++) {
			Character ch = brasis.charAt(i);
			if (ch == '{' || ch == '[' || ch == '(') {
				stack.push(ch);
			} else if (!stack.empty() && (
					(ch == ')' && stack.peek() == '(') || 
					(ch == '}' && stack.peek() == '{') || 
					(ch == ']' && stack.peek() == '['))) {
				stack.pop();
			}else {
				stack.push(ch);
				break;
			}

		}
		if(stack.empty()) {
			System.out.println("Balenced");
		}else {
			System.out.println("Not Balenced");
		}
			

	}

}
