package step02.two.day;

public class Q8 {

	static int[][] mdays = {
			{31,28,31,30,31,30,31,31,30,31,30,31}, //평년
			{31,29,31,30,31,30,31,31,30,31,30,31}	//윤년
	};
			
	//윤년은1 평년 0 
	static int isLeap( int year) {
		System.out.println("year: "+year%4 +", %100: "+year%100+", %400: "+year%400);
		return (year % 4 == 0 && year % 100 !=0 && year % 400 ==0) ? 1:0;
	}
	
	static int dayOfYear(int y, int m, int d) {
		System.out.println("m: "+m);
		while (--m != 0) {
			d += mdays[isLeap(y)][m-1];
		}
		return d;
	}
	
	public static void main(String[] args) {
		System.out.println(dayOfYear(1996, 1, 27));
	}
	
}
