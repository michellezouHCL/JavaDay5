package exercise2;

import java.util.Scanner;

public class Palindrome {

	/*
	 * The big O of this function is O(n).
	 */
	public static boolean palindrome(String s) {
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input String to determine if Palindrome");
		String s = sc.nextLine();
		System.out.print("Answer: " + palindrome(s));
		sc.close();
	}

}
