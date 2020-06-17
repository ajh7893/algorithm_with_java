package step01.two;

import java.util.Scanner;

public class SumFor {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("sum 1 to n ");
		
		System.out.println("input n");
		int n = scan.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i <= n ; i++) {
			sum += i;
			
		}
		
		System.out.println("1 to n:" +sum);
		
	}
}
