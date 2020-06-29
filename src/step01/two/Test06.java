package step01.two;

import java.util.Scanner;

public class Test06 {

	
	
	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("put a: ");
		
		int a ;
		do {
			 a = scan.nextInt();
			
			
			System.out.println("a: "+ a);		
			
			
		} while (a<=0);
		if(a<=1 || a>=99) {
			System.out.println("a 1자리");
		}else if(a<=10 || a>=99) {
			System.out.println("a 2자리");
		}else if(a<100 || a>=999) {
			System.out.println("a 3자리");
		}else if(a<=1000 || a>=9999) {
			System.out.println("a 4자리");
		}
		
	}
	
	
	
	
	
}
