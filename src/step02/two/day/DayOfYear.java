package step02.two.day;

public class DayOfYear {

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
		int day =d;
		
		for (int i = 1; i < m; i++) {
			day += mdays[isLeap(y)][i-1];
			
		}return day;
		
	}
	
	public static void main(String[] args) {
		System.out.println(dayOfYear(1996, 3, 27));
	}
	
}
