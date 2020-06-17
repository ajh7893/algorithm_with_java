package step01.two;

import java.util.Scanner;

public class SumWhile {
	
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("sum 1 to n");
		System.out.println("n의값을 입력");
		int n = scan.nextInt();
		
		//합
		int sum = 0;
		int i =1;
		
		while(i<=n) {
			sum +=i;
			i = i + 1;
		}
		System.out.println("n: "+n);
		System.out.println("sum 1 to n: "+ sum);
			
	}
}
