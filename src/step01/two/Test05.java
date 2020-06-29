package step01.two;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {

		// 두변수 a,b에 정수를 입력하고b-a를 출력하는 프로그램을 작성

		Scanner scan = new Scanner(System.in);

		int a;
		int b;
		System.out.print(" a의 값: ");
		a = scan.nextInt();
		do {
			
			System.out.print(" b의 값: ");
			b = scan.nextInt();
			
			if(a>b)
				System.out.println("a보다 큰값을 넣어 주세요");
			
		} while (a > b );
			
		int sum =b-a;



		System.out.println("b-a:" + sum);
	}

}
