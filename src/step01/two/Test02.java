package step01.two;

import java.util.Scanner;

public class Test02 {
	
	
	public static int kausSum(int a, int b){
		
		
		
		int result = (a+b)*(b/2);
		System.out.println(result);
		return result;
	}
	
	public static int gaus(int f, int l) {
		int sum = 0;
		for (int i = 0; i <= l; i++) {
			sum = sum +i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("n?");
		int n = scan.nextInt();
		kausSum(1,n);
		
	}
}
