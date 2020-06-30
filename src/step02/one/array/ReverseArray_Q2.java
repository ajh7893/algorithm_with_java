package step02.one.array;

import java.util.Scanner;

public class ReverseArray_Q2 {

	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1]=a[idx2];
		a[idx2]= t;
	}
	
	static void reverse(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}System.out.println();
		
		
		for (int i = 0; i < a.length/2; i++) {
			int idx1 = i;
			int idx2 = a.length-i-1;
			swap(a, idx1,idx2);
			System.out.println("a["+idx1+"]과 "+"a["+idx2+"]를 바꿉니다.");
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[j]+" ");
				
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		int[] arr = { 5, 10, 73, 2, -5, 42 };
		
		reverse(arr);
	}
	
}
