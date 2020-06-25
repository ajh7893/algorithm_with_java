package step02.one.array;

import java.util.Scanner;

public class MaxOfArray {
	
	static int maxOf(int[] a ) {
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			
			if(a[i]>max) {
				max = a[i];
				
			}
			
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("키 최댓값");
		System.out.print("사람 수: ");
		int num = scan.nextInt();
		
		int[] height = new int[num];
		
		for (int i = 0; i < height.length; i++) {
			System.out.print("height["+i+"]: ");
			height[i]= scan.nextInt();
		}
		System.out.println("최댓값은: "+ maxOf(height));
	}

}
