package basicprograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (ispali(n)) {
			System.out.println("palindrome");
		}
	}

	static boolean ispali(int n) {
		String s1 = "" + n;
		String s2 = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			s2 = s2 + s1.charAt(i);

		}
		return s1.equals(s2);

	}

}
