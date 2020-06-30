package step02.one.conversion;

import java.util.Scanner;

public class Exam7 {
	
	static void swap(int[] l) {
		int temp;
		
		temp= l[0];
		l[0]=l[1];
		l[1]=temp;
		
	}
	static int GDC(int x, int y) {
		int m = x % y;
		System.out.println("m: "+m+": ");
		if (m == 0) {
			System.out.println("dd: "+y);
			return y;
		}
		System.out.println("aaaa"+GDC(y,m));
		return GDC(y,m);
	}
	public static void main(String[] args) {
		int[] a = new int[2];
		int r;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("a[0]");
		a[0]= scan.nextInt();
		System.out.println("a[1]");
		a[1]=scan.nextInt();
		
		if(a[0]<a[1]) {
			swap(a);
		}
		r = GDC(a[0],a[1]);
		System.out.println("최대 공약수는 :"+r);
	}
}
