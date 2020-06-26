package step02.one.array;

import java.util.Random;

public class ArrayEqual {
	
	//a어레이b어레이로 복사
	static void copy(int[]a, int[]b) {
		for (int i = 0; i < b.length; i++) {
			//a를b로 담아라
			b[i]=a[i];
			
		}
	}
	
	//reverse
	static void reverse(int[] a, int[]b) {
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a.length);
			System.out.println("recopy");
			b[i] = a[a.length-i-1];
			
		}
			
	}
	
	//같은지 같이 않은지  같으면 트루를 리턴
	static boolean equals(int[] a, int[] b) {
		if(a.length != b.length)
			return false;
		
		for (int i = 0; i < b.length; i++) {
			if(a[i]!=b[i]) {
				return false;
			}
			
		}
		return true;
	}
	
	
	
	public static void main(String[] args) {
		int[] a = new int[5];
		Random ran = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = ran.nextInt(5);
			System.out.println(a[i]);
		}
		int[] b = new int[5];
//		for (int i = 0; i < a.length; i++) {
//			b[i]= ran.nextInt(1);
//			
//		}
		//복사뜸 
//		copy(a,b);
//		for (int i = 0; i < b.length; i++) {
//			System.out.print("a: "+a[i]+ " ");
//			
//			System.out.print("b: "+b[i]+" ");
//		}
		
		reverse(a, b);
		for (int i = 0; i < a.length; i++) {
			System.out.print("a["+i+"]: "+a[i]+"  ");
			System.out.print("b["+i+"]: "+b[i]);
			System.out.println("");
		}
//		System.out.println("a, b의 배열은"+ (equals(a,b) ? "같습니다.":"같지않습니다"));
		
	}
}
