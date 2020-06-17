package step01.two;

public class Test03 {

	
	static int sumof(int a, int b) {
		int result = 0;
		
		for (int i = a; i <= b; i++) {
			result += i;
			
		}
		
		System.out.println(result);
		return result;
	}
	
	
	public static void main(String[] args) {
		sumof(2,10);
	}


}

