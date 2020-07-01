package step.two.classes;

public class PrimeNumber1 {

	
	
	public static void main(String[] args) {
		int counter = 0;
		 for (int i = 2; i < 100; i++) {
			 //브레이크 제 시작점.
			 int j;
			 
			 for ( j = 2; j < i; j++) {
				if (i % j == 0) {
					System.out.println("i: "+i);
					System.out.println("j: "+j);
					System.out.println("i%j: "+i%j+"   break ");
					break; //브레이크면 포문 처음으로 돌아갑니다.
					
				}
			 }
			 if(i==j)
				 System.out.println("소수: "+i);
			 System.out.println("=============");
		}
	}
}
