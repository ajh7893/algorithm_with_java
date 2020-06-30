package other.one.sangi;

public class 최댓값과최솟값 {
	public static void main(String[] args) {
		int m = 0;
		int i = 0;
		int eng[] = {70,60,55,90,85,75,80,100,95,45} ;
		int math[] = {90,45,60,77,85,65,80,95,80,55 };
		while(true) {
			if(eng[i]==100) {
				if(math[i]>m)
					m=math[i];
			}
			i++;
			if(i>=10) break;
		}
		System.out.println(m);
		

	}
}
