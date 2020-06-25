package step02.one.array;

import java.util.Random;

public class ArrayEqual {
	
	static void copy(int[]a, int[]b) {
		for (int i = 0; i < b.length; i++) {
			b[i]=a[i];
			
		}
	}
	
	static boolean equals(int[] a, int[] b) {
		if(a.length != b.length)
			return false;
		
		for (int i = 0; i < b.length; i++) {
			if(a[i]!=b[i]) {
				return false;
			}
			
			
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[] a =new int[5];
		Random ran = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = ran.nextInt(5);
			
		}
		
		int[] b = new int[5];
//		for (int i = 0; i < a.length; i++) {
//			b[i]= ran.nextInt(1);
//			
//		}
		copy(a,b);
		for (int i = 0; i < b.length; i++) {
			System.out.print("a: "+a[i]+ " ");
			
			System.out.print("b: "+b[i]+" ");
		}
//		System.out.println("a, b의 배열은"+ (equals(a,b) ? "같습니다.":"같지않습니다"));
		
	}
}
