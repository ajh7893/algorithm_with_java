package step02.one.array;

public class ReverseTest {

	
	static void swap(int[]a, int idx1, int idx2) {
		int t;
		
		t = a[idx1];
		a[idx1]= a[idx2];
		a[idx2]= t;
		
		
	}
	static void rev(int[] a) {
		
		for (int i = 0; i < a.length/2; i++) {
			int idx1 = i;
			int idx2 = a.length-i-1;
			System.out.println("a["+idx1+"]와 a["+idx2+"]를 바꿉니다.");
			swap(a,idx1,idx2);
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[j]+" ");	
			}
			System.out.println("");
			
		}
	}
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7};
		rev(a);
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
			
		}
		System.out.println("sum: "+sum);
		
		
		System.out.println("==============");
		
	}
	
}
