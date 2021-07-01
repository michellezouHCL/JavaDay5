package exercise3;

import java.util.Stack;

public class MatchParenthesis {

	public static boolean matchParenthesis(String s) {
		s.trim();
		Stack<Character> st = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '{' || c == '[' || c == '(' || c == '<') {
				st.push(c);
			}
			if (c == '}' || c == ']' || c == ')' || c == '>') {
				char tmp;
				switch (c) {
				case '}':
					tmp = st.pop();
					if (tmp != '{') {
						return false;
					}
					break;
				case ']':
					tmp = st.pop();
					if (tmp != '[') {
						return false;
					}
					break;
				case ')':
					tmp = st.pop();
					if (tmp != '(') {
						return false;
					}
					break;
				case '>':
					tmp = st.pop();
					if (tmp != '<') {
						return false;
					}
					break;
				}
			}

			if (st.isEmpty()) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "[2*(1+3)]";
		System.out.print(matchParenthesis(s));
	}

}
