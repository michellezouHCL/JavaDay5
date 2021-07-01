package exercise1;

import java.util.Scanner;

public class MaxCharacter {

	public static int maxCharacter(String s) {
		s.trim();
		int maxIndex = 0;
		int count = 1;
		int maxCount = -1;
		char maxCh = s.charAt(0);
		for (int i = 0; i < s.length(); i++) {
			for (int j = 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;
				} else {
					if (count > maxCount) {
						maxCount = count;
						maxCh = s.charAt(i);
					}
					count = 1;
				}
			}
		}

		maxIndex = s.indexOf(maxCh);
		return maxIndex;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Input String to find max character:");
		String s = sc.nextLine();
		System.out.print("The index of max character is: " + maxCharacter(s));
		sc.close();
	}

}
