package step03.binsearch;

import java.util.Scanner;

public class BinSearch {

    static int binSearch(int[]a, int n, int key){
        int pl=0;
        int pr=n-1;
        int count = 0;
        do{
            int pc = (pl + pr)/2;
            //중간 인덱스의 값과 키값이 같으면 리턴
            if(a[pc]==key)
                return pc;
            else if(a[pc]<key)//센터의 값이 키보다 작으면
                pl = pc+1;//pl은 pc+1인덱스
            else
                pr = pc-1; //앞쪽으로좁힌다.
            count++;
            System.out.println(count);
        }while(pl<=pr);

        return -1;

    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("요소수:" );
        int num = scan.nextInt();
        int[] x = new int [num];
        System.out.println("오름차순으로 입력하세요!");
        System.out.print("x[0]:");
        x[0]=scan.nextInt();

        for(int i = 1; i <num; i++){
            do{
                System.out.print("x["+i+"]: ");
                x[i]=scan.nextInt();
            }while(x[i]<x[i-1]);//바로 앞의 요소보다 작으면 다시 입력.
        }
        System.out.print("검색 할 값:");

        int ky = scan.nextInt();
        int idx = binSearch(x, num, ky);

        if(idx==-1)
            System.out.println("그값의 요소는 없음.");
        else
            System.out.println(ky+"은(는) x["+idx+"]에 있읍니다.");
    }

}
