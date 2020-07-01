package step.two.classes;

public class PrimeNumber2_arr {

	
	public static void main(String[] args) {
		
		int counter = 0;
		int add = 0;
		int prime[] = new int[500];
		//prime[add+] =2; 	     2는 소수다.   add 는1이다.
		for (int i = 2; i < 1000; i++) {	//int i = 3;홀수만.. n+=2 
			int j;
			for ( j = 2; j < 1000; j++) {   // j < add  이미 찾은 소수로 나눈다.
				counter++;
				if (i % j == 0) { 			// n % prime[j] == 0 나누어 떨어지면 소수가 아님.
					break;					//더이상의 반복은 불필요.
				}
			}
			if (i==j) {							//add == j      
				prime[add++] = i; 
			}
		}
		for (int i = 0; i < prime.length; i++) {
			if(prime[i]!=0)
			System.out.println(prime[i]);
		}
		System.out.println("나눈수 : "+counter);
	}
	
	
}
