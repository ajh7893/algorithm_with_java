package step01.two;

public class Test04 {

	public static void main(String[] args) {
		System.out.println(" |1 2 3 4 5 6 7 8 9");
		System.out.println("--------------------");
		for (int i = 1; i <= 9; i++) {
			System.out.print(i+"|");
			for (int j = 1; j <= 9; j++) {
				System.out.print(i*j+" ");
				
			}
			System.out.println(" ");
		}
		System.out.println("============================");
		System.out.println(" |1 2 3 4 5 6 7 8 9");
		System.out.println("--------------------");
		for (int i = 1; i <= 9; i++) {
			System.out.print(i+"|");
			for (int j = 1; j <= 9; j++) {
				System.out.print(i+j+" ");
			}
			System.out.println(" ");
		}
		
		
		
		
		System.out.println("============================");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("============================");
		int a , b, c;
		int num = 5;
		for (a = 0; a <= num; a++) {
			for (b = 1; b <= num-a; b++) {
				System.out.print(" ");
			}
			for(c =0; c<a*2+1; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	
	
}
