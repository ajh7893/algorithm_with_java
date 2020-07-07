package step03.seqsearch;

import java.util.Scanner;

//보초법 :
public class SeqSearchSen {

    static int seqSearchSen(int[] a, int n, int key){
        int i =0;
        a[n]= key; //보초 추가.

        while(true){
            if(a[i]==key)
                break;
            i++;
        }
        //마지막배열에 보초를 두고 같으면 같은인덱쓰까지 구해버리면. 조건이 종료되게...
        return i == n ? -1 : i;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("요소수: ");
        int num =scan.nextInt();
        int[] x = new int[num+1];

        for (int i = 0; i< num; i++){
            System.out.print("x["+i+"]:"+"");
            x[i]=scan.nextInt();
        }


        System.out.print("검색할 값: ");
        int ky = scan.nextInt();
        int idx = seqSearchSen(x, num, ky);

        if(idx == -1)
            System.out.println("없다.!!");
        else
            System.out.println(ky+"는 x["+idx+"]에 있음. ");


    }

}
