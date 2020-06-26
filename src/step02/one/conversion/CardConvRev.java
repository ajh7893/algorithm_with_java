package step02.one.conversion;

import java.util.Scanner;

//입력 받은 10진수를 2진수 ~ 36진수로 기수 변환.
//기수: 수를 나타냄  서수: 사물의 순서를 나타냄 첫째둘째..
public class CardConvRev {

	
	static int cardConv(int x, int r, char[] d) {
		
		//변환후 자리
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			//r로 나는 나머지를 저장
			d[digits++] = dchar.charAt(x % r);
			x /=r ;
			
		}while(x!=0);
		return digits;
		//10진수 59는 16진수로 변환하 B3으로 변환된다.
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//변환하는 정수
		int no;
		//기수
		int cd;
		//변환후의 자릿수;
		int dno;
		//다시
		int retry;
		//변환 후 각 자리의 숫자를 넣어두는 문자의 배열
		char [] cno =new char[32];
		
		System.out.println("10진수를 기수 변환합니다.");
		do {
			do {
				System.out.print("변환하는 음이 아닌 정수: ");
				no = scan.nextInt();
						
			}while(no<0);
			do {
				System.out.println("어떤 진수로 변환 할까요 2~36: ");
				cd = scan.nextInt();
			}while(cd<2||cd>36);
							//59, 16, 배열
			dno = cardConv(no, cd, cno); //no를 cd진수로 변환
			//역순
			System.out.println(cd+"진로수는 ");
			for (int i = dno-1; i>=0; i--) {
				System.out.print(cno[i]);
				
			}
			System.out.print("입니다.");
			System.out.println("g한번더??? 1. 예 0. 아니오");
			retry = scan.nextInt();
		}while(retry==1);
	}
}
