package other.one.sangi;

public class 소인수분해 {
	public static void main(String[] args) {
		
		int a[] = new int[20];
		int n = 20;
		int t = 0;
		
		do {
			if(n >= 2) {
				int p = 2;
				for(;p<=n; p++) {
					if(n % p ==0) {
						System.out.println(n+", "+p);
						break;}
				}
				a[t] = p ;
				n = n/p;
				t++;
			}else {
				return;
			}
		} while (n!=1);
		if(t==1)
			System.out.println("th소수");
		else {
			for (int i = 0; i < t-1; i++) {
				System.out.print(a[i]+"*");
				
			}
			System.out.println(a[t-1]);
		}
	}
}
