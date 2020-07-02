package step02.two.classes;


//넓이가 100이라는것은 직사각혀으이 어느 한 변으로 나눌 수 있다라는 의미입니다. 이러한 성질을 이용하여 제곱근을 한 번으로 하는 이후의 직사각형에 대한
//계산량을 줄이는 것이 알고리짐 개선이다.
//어떤 정수 n은 다음 조건을 만족하면 소수다 _n의 제곱근 이하의 어떤 소수로도 나누어 떨어지지 않는다.
public class PrimeNumber3_pow {
	public static void main(String[] args) {
		int count = 0; 
		int ptr = 0;
		int[] prime = new int [500];
		
		prime[ptr++] = 2;
		prime[ptr++] = 3;
		System.out.println(ptr);
		for (int i = 5; i <= 1000; i+=2) { //홀수만.
			boolean flag = false;
			for (int j = 1; prime[j]*prime[j] <= i ; j++) {
				count+=2;
				
				if (i % prime[j]==0) {  // 나누어 떨어지면 소수가 아니다.
					System.out.println("i: "+i+"  prime j: "+prime[j]+ "   p*p: "+prime[j]*prime[j]);
					flag = true;
					break;
				}
			}
			if(!flag) {
				prime[ptr++] = i;
				count++;
			}
		}
		for (int i = 0; i < ptr; i++) {
			System.out.println(prime[i]);
			
		}
		System.out.println("count: " +count);
	}
}
