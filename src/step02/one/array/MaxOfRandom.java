package step02.one.array;

import java.util.Random;
import java.util.Scanner;

public class MaxOfRandom {
	
	static int maxOf(int[] a) {
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if(a[i]>max) {
				max = a[i];
			}
			
		}
		return max;
		
	}

	
	public static void main(String[] args) {
		
		
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("키의 최댓값");
		
		System.out.print("사람 수:");
		int num = scan.nextInt();
		int[] height = new int[num];
		System.out.println("키값");
		for (int i = 0; i < height.length; i++) {
			height[i]= 100 + ran.nextInt(90);
			System.out.println("height["+i+"]: " +height[i]);
			
		}
		System.out.println(maxOf(height));
		
	}
}
