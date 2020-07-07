package step03.seqsearch;


import java.util.Scanner;

//선형 검색
public class SeqSearch {
    //요소수 n인 배열에서 a와 key와 같은 요소를 선형검색한다.
    static int seqSearch(int[]a, int n, int key){
        int i = 0;

        while(true){
            if(i==n)
                return -1;//검색 실패시.
            if(a[i] == key)
                return i;
            i++;
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("요소수: ");
        int num =scan.nextInt();
        int[] x = new int[num];

        for (int i = 0; i< num; i++){
            System.out.print("x["+i+"]:"+"");
            x[i]=scan.nextInt();
        }


        System.out.print("검색할 값: ");
        int ky = scan.nextInt();
        int idx = seqSearch(x, num, ky);

        if(idx == -1)
            System.out.println("없다.!!");
        else
            System.out.println(ky+"는 x["+idx+"]에 있음. ");


    }

}
