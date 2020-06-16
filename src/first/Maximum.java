package first;

import java.util.Scanner;

public class Maximum {
	public static void main(String[] args) {
		Scanner scc = new Scanner(System.in);
		
		System.out.println("a");
		int a = scc.nextInt();
		System.out.println("b");
		int b = scc.nextInt();
		System.out.println("c");
		int c = scc.nextInt();
		
		int max = a;
		
		if(max < b) {
			max = b;
		}
		if(max < c) {
			max = c;
		}
		
		System.out.println("max:"+ max);
		
		
			
		
		
		
	}
}
