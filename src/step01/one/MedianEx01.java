package step01.one;

public class MedianEx01 {

	//효율이 떨어짐..
	static int med(int a, int b, int c) {
		if((b>= a && c <=a)||(b<=a && c>=a))
			return a;
		else if ((a>b && c<b)||(a<b && c>b))
			return b;
		return c;
	}
	
	
	public static void main(String[] args) {
		System.out.println(med(1,2,3));
	}
	
	
}
