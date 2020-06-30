package other.one.sangi;

public class 소수판별 {
	//소수판별 1에서 10까지의 소수중 가장큰 소수를 출력
	public static void main(String[] args) {
		int p = 2; // 가장큰 소수를 보관하는 변수 초깃값은 소수 2로 설정.
		int n = 3; // 자연수 3부터 100까지 소수 여부를 조사 하기 시작.
		while(true) {
			System.out.println("n: "+n);
			double tmp = Math.sqrt(n); // 자연수 n의 제곱근을 정수로 구하여 m에 저장한다.
			System.out.println("tmp: "+tmp);
			int m = (int) tmp;
			System.out.println("m: "+m);
			System.out.println("===================================");
			for (int i = 2; i <= m ; i++) { //자연수 n을 2부터 m까지 나누어서 소수인지 점검한다.
				int r = n%i; //나머지를 저장.
				if(r == 0)
					break;
				if(i == m)
					p = m;
				
			}
			n++;
			if(n>100)
				break;
			
		}
		System.out.println("p: "+p);
		
		
		
	}
	
	
}
