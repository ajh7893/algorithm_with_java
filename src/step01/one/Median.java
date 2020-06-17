package step01.one;

import java.util.Scanner;

public class Median {	
	static int med(int a, int b, int c) {
		if (a >= b)
			if(b>=c)
				return b;
			else if (a <=c )
				return a;
			else
				return c;
		else if (a>c)
			return a;
		else if (b>c)
			return c;
		else 
			return b;
		
	}
	public static void main(String[] args) {
		Scanner scc = new Scanner(System.in);
		System.out.println("a");
		int a = scc.nextInt();
		System.out.println("b");
		int b = scc.nextInt();
		System.out.println("c");
		int c = scc.nextInt();
		System.out.println("med: "+med(a,b,c));
		
	}

}
