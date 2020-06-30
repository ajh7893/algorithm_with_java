package step02.one.conversion;

import java.util.Scanner;

public class CardConRev_Q6 {

	static int cardConvRev(int x, int r, char[] d) {

		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		System.out.println(r+" |   "+x+"   ");
		do {
			
			if(x!=0)
				System.out.println(r+" |   "+x+" ... " +x%r);
			else
				System.out.println(d);
			d[digits++] = dchar.charAt(x % r);
			x = x / r;
			
			
		} while (x != 0);
		System.out.print("변환 된 '");
		for (int i = digits-1; i >= 0 ; i--) {
			System.out.print(d[i]);
		}System.out.println("'입니다.");
		
		return digits;

	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int no;
		int cd;
		//변환 후 자릿수
		int dno;
		int retry;
		char[] cno = new char[32];
		
		System.out.println("변환할 기수");
		do {
			do {
				System.out.println("변환하는 음이 아닌 정수: ");
				no = scan.nextInt();
			} while (no < 0 );
			
			do {
				System.out.println(" 어떤진수?? (2~36) ");
				cd = scan.nextInt();
			} while (cd<2||cd>32);
			System.out.println(" ");
			dno = cardConvRev(no, cd, cno);
			
			
			
			
//			for (int i = dno-1; i >= 0; i--) {
//				System.out.print(cno[i]);
//			}System.out.println("입니다.");
			
			
			
			
			
			
			
			
			System.out.println("1. y 2. n");
			retry = scan.nextInt();
		} while (retry ==1 );
	}
	
	
	
	
}
