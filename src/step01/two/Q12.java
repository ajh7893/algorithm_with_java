package step01.two;

public class Q12 {

	public static void main(String[] args) {

		System.out.println("  | 1 2 3 4 5 6 7 8 9");
		System.out.println("--+------------------");
		for (int i = 1; i < 10; i++) {
			System.out.print(i + " | ");
			for (int j = 1; j < 10; j++) {
				System.out.print(i * j + " ");
			}
			System.out.println();

		}

		// Q13
		System.out.println("Q13========================");
		System.out.println("  | 1 2 3 4 5 6 7 8 9");
		System.out.println("--+------------------");
		for (int i = 1; i < 10; i++) {
			System.out.print(i + " | ");
			for (int j = 1; j < 10; j++) {
				System.out.print(i + j + " ");
			}
			System.out.println();

		}
		// Q14
		System.out.println("Q14========================");
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

		// Q15
		System.out.println("Q15========================");
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		// Q16 피라미
		System.out.println("Q16========================");
		for (int i = 1; i < 10; i++) {
			for (int j = 10; j >= 0 ; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (i-1)*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

}
