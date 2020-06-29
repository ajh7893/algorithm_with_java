package step01.two;

import java.util.Scanner;

public class Q15 {

	static void star(int n) {

		for (int i = 0; i <= n; i++) { 		// n = 10
			for (int j = 0; j <= i; j++) { 	// 0....10
				System.out.print("*");

			}
			System.out.println();
		}

	}

	static void starL(int n) {

		for (int i = 0; i <= n; i++) { 		// n = 10
			System.out.print("");
			for (int j = n; j >= i; j--) { 	// 10...1
				System.out.print("*");
			}
			System.out.println();
		}

	}

	static void starR(int n) {
		for (int i = 0; i <= n; i++) { 				// n = 10
			System.out.println();
			for (int j = 0; j <= i - 1; j++) { 		// -1, 0, 1, 2, ...
				System.out.print(" ");
			}
			for (int k = 0; k <= n - i - 1; k++) { 	// 9, 8, 7, 6...
				System.out.print("*"); 				
			}
		}
		System.out.println();
	}

	static void starR1(int n) {

		for (int i = 0; i <= n; i++) {
			System.out.println();
			for (int j = n; j > i; j--) { 			// 9, 8, 7..
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {			// 1 2 3 4
				System.out.print("*");

			}

		}
		System.out.println();

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("몇개 ?");
		int a = scan.nextInt();

		System.out.println("==============star");
		star(a);
		System.out.println("==============starL");
		starL(a);
		System.out.println("==============starR");
		starR(a);
		System.out.println("==============starR1");
		starR1(a);
		// Q16 피라미
		System.out.println("Q16========================");
		for (int i = 1; i < 10; i++) {
			for (int j = 10; j > i; j--) {  // 10..
				System.out.print(" ");
			}
			for (int j = 1; j <= (i - 1) * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

}
