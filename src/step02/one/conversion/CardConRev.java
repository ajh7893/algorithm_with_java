package step02.one.conversion;

import java.util.Scanner;

//입력받은 10진수를 2~36진수로 기수 변환하여 나타냄
public class CardConRev {

	//정수값x를 r진수로 변환하여 배열d에 아랫자리부터 넣어두고 자릿수를 반환
	static int cardConvR(int x, int r, char[] d) {
		
		//변환 후 자릿수
		int digits = 0;
		
		
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			//call by reference
			d[digits++] = dchar.charAt(x%r);  //x를 r로 나눈 나머지.
			x = x / r;
		}while(x != 0);
		System.out.print("변환 된 '");
		for (int i = digits-1; i >= 0 ; i--) {
			System.out.print(d[i]);
		}System.out.println("'입니다.");
		
		return digits;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//변환하는 정수
		int no;
		//기수
		int cd; 
		//변환후 자리수
		int dno;
		//다시한번
		int retry;
		//변환후 각 자리의 숫자를 넣어두는 문자의 배열
		char[] cno = new char[32];
		
		
		System.out.println("10진수를 기수 변환합니다.");
		do {
			do {
				System.out.println("변환하는 음이 아닌 정수: ");
				no = scan.nextInt();
			} while (no < 0);
			
			do {
				System.out.println("어떤 진수로 변환 할까요?(2~36)");
				cd = scan.nextInt();
			} while (cd< 2|| cd> 36);
			//변환하는 정수, 기수, 변환후 자릿수
			dno= cardConvR(no, cd, cno);
			
			System.out.print(cd+"진수로는 '");
			for (int i = dno-1; i >= 0; i--) {
				//윗자리부터 차례대로
				System.out.print(cno[i]);
				
				
				
			}
			System.out.println("' 입니다.");
			System.out.println("한번더? 1.y 2.n");
			retry = scan.nextInt();
		} while (retry == 1);
		
		
	}
	
	
	
	
}
