package step01.one;
//네 값의 최댓값을 구하는 max4 메서드를 작성하세요.

import java.util.Scanner;

public class Test2 {
 
 public static void main(String[] args) {
    System.out.println(max4(1,3,4,5));
    System.out.println(max4(3,6,0,99));
    System.out.println(max4(-99,6,0,99));
    
    
    
    
    
 }
 
 
 static int max4(int a, int b, int c, int d) {
    Scanner scan = new Scanner(System.in);
    int [] arr4 = {a,b,c,d};
    int max=a;
          
    for(int i=0; i<arr4.length; i++) {
       if(arr4[i]>max) {
          max=arr4[i];
       }
    }
    
    return max;
 }
}