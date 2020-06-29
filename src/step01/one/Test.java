package step01.one;

import java.util.Scanner;

public class Test {

	
	static int max4( int a, int b, int c, int d) {
		int max = a;
		if(b>max)
			max=b;
		if(c>max)
			max=c;
		if(d>max)
			max=d;
		return max;
	}
	
	
	static int min3( int a, int b, int c) {
		int min = a;
		if(min<b)
			min=b;
		if(min<c)
			min=c;
		return min;
	}
	
	public static void main(String[] args) {
		
		//put the value in var
		Scanner scan = new Scanner(System.in);
		System.out.println("a");
		int a =scan.nextInt();
		System.out.println("b");
		int b =scan.nextInt();
		System.out.println("c");
		int c =scan.nextInt();
		System.out.println("d");
		int d =scan.nextInt();
		
		
		
		System.out.println("최댓");
		System.out.println(max4(a,b,c,d));
		System.out.println(min3(a,b,c));
		System.out.println("몇개?");
		
		System.out.println("===========================");
		int ma = scan.nextInt();
		int[] arr = new int[ma];
		int max1 = 0;
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = scan.nextInt();
//			max1=arr[i];
//			if(max1>arr[i])
//				max1=arr[i];
		}
		
	}
	
	
	
	
}
