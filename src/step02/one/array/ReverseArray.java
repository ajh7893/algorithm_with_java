package step02.one.array;

import java.util.Scanner;

public class ReverseArray {
	static void swap(int[] a, int idx1, int idx2) {
		// idx1 은 t로
		int t = a[idx1];
		// idx2 는 a[idx1]
		a[idx1] = a[idx2];
		// t는 a[idx2]로
		a[idx2] = t;
	}

	static void swap1(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	
	static void reverse1(int[] a) {
		for (int i = 0; i < a.length/2; i++) {
			swap(a, i , a.length -i -1);
				
			
		}
		
	}
	
	static void reverse(int[] a) {
		for (int i = 0; i < a.length/2; i++) {
			swap(a, i, a.length -i- 1);
			System.out.println("re: "+a[i]);
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		System.out.println("요솟수 : ");
		int num1 = scan.nextInt();
		int num = stdIn.nextInt();
		int[] x = new int[num];
		int[] y = new int[num1];
		for (int i = 0; i < y.length; i++) {
			y[i]=scan.nextInt();
		}
		for (int i = 0; i < num; i++) {
			System.out.println("x[ " + i + " ]");
			x[i] = stdIn.nextInt();
		}
		reverse(x);
		System.out.println("요소를 역순으로 정렬했습니다.");
		for (int i = 0; i < num; i++) {
			System.out.println("x[ " + i + " ] = " + x[i]);

		}
	}

}
