package step01.one;
//3개의 정숫값을 입력하고 최댓값 구하기

import java.util.Scanner;

public class Test3 {
 public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("3개의 정수를 입력하세요");
    
    int [] arr = new int[3];
    int max = 0;
    
    for(int i = 0; i<arr.length; i++) {
       System.out.println(i+1+"번째 정수 :");
       arr[i] = scan.nextInt();
       if(arr[i]>max) {
          max = arr[i];
       }
    }
    
    System.out.println("최댓값은 "+ max +"입니다");

 }
}
