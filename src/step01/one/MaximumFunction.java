package step01.one;

public class MaximumFunction {

	
	static int maximum(int a, int b, int c) {
		
		int max = a ;
		
		if(max < b) {
			max = b;
		}
		if(max < c) {
			max = c;
		}
		
		return max;
		
	}
	
	static int minimum( int a, int b, int c) {
		int min = a;
		if(min>b) {
			min = b;
		}
		if(min > c) {
			min = c;
		}
		return min;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("max: "+maximum(10, 9, 8));
		System.out.println("min: "+minimum(10, 9, 8));
		
		
		
	}
	
}
