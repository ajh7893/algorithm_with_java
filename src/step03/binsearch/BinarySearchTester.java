package step03.binsearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("index: ");
        int num = scan.nextInt();
        int[]x = new int[num];
        System.out.print("오름차순으로 입력하세요");
        System.out.print("x[0]:");
        x[0]=scan.nextInt();

        for(int i = 1; i<num; i++){
            do{
                System.out.print("x["+i+"]: ");
                x[i]=scan.nextInt();

            }while(x[i]<x[i-1]); //바로앞의 요소보다 작으면 다시입력한다.

        }
        System.out.print("검색할값: ");
        int ky = scan.nextInt();
        int idx = Arrays.binarySearch(x,ky);//배열 x에서 ky인 요소를 검색한다.

        if(idx < 0)
            System.out.print("없음니다.");
        else
            System.out.print(ky+" is x["+idx+"]");


    }


}
