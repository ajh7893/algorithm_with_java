package step01.one;

import java.util.Scanner;

public class Max3 {

	
	//3개의 정수값을 입력하고 최댓값을 구합니다
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.println("value of a");
		int a = scan.nextInt();
		System.out.println("value of b");
		int b = scan.nextInt();
		System.out.println("value of c");
		int c = scan.nextInt();
		
		int max = a;
		if(b >max) 
			max = b;
		if(c>max)
			max=c;
		
			System.out.println("maximum is: "+max);
	}
	
	
	
	
}
