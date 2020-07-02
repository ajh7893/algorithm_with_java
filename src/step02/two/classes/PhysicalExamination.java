package step02.two.classes;

import java.util.Scanner;

public class PhysicalExamination {

	
	
	//시력 분포 0.0~2.1
	static final int VMAX = 21;

	static class PhyscData{
		String name;
		int height;
		double vision;
		
		PhyscData(String name, int height, double vision){
			this.name=name;
			this.height=height;
			this.vision=vision;
	}
	
		static double avgH(PhyscData[] dat) {
			double sum =0;
			
			for (int i = 0; i < dat.length; i++) {
				sum += dat[i].height;
			}
			return sum/dat.length;
		}
		
		static void disVision(PhyscData[] dat, int [] dist) {
			int i = 0;
			
			dist[i]= 0;
			for(i = 0; i<dat.length;i++) {
				if(dat[i].vision >= 0 && dat[i].vision <VMAX/ 10.0) {
					dist[(int)(dat[i].vision)*10]++;
				}
			}
		}
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		PhyscData[] x = {
				new PhyscData("박현", 162, 0.3),
				new PhyscData("박현규", 190, 1.0),
				new PhyscData("안정하", 182, 0.9),
				new PhyscData("최은아", 164, 0.7),
				new PhyscData("손영우", 170, 0.5),
				new PhyscData("허준욱", 190, 0.4),
				new PhyscData("김송호", 166, 0.3),
				new PhyscData("김형진", 199, 0.2),
				new PhyscData("방성원", 169, 0.1)
		};
		//시력분포
		int[] vdist = new int[VMAX];
		
	System.out.println("신체검사 리스트");
	System.out.println("이름		키		시력");
	System.out.println("---------------------");
	for (int i = 0; i < x.length; i++) {
		System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
		
		
	}
		System.out.printf("\n 평균키.: %5.1fcm\n", avgH(x));
		disVision(x, vdist);
		
		
		System.out.println("시력분포");
		for (int i = 0; i < VMAX; i++) {
			System.out.printf("%3.1f~%2d명\n", i/10.0,vdist[i]);
			
		}
	}
	}
	
}
