package exercise6;

import java.util.Scanner;

public class ConsecutiveSum {

	public static int consecutiveSum(int n) {
		return (int) (n * ((double) (n + 1) / 2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input integer to find consecutive sum:");
		int n = sc.nextInt();
		System.out.print("Answer: " + consecutiveSum(n));
		sc.close();
	}

}
