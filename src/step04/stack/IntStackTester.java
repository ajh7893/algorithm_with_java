package step04.stack;

import java.util.Scanner;

public class IntStackTester {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        IntStack s = new IntStack(64);

        while(true){
            System.out.println("현재 데이터 수:"+s.size()
            +"/" +s.capacity() +"");
            System.out.print("1.push  2.pop  3.peek  4.dump  5.exit");

            int menu = scan.nextInt();
            if(menu ==0 ) break;

            int x;
            switch(menu){
                case 1:
                    System.out.print("data:");
                    x=scan.nextInt();
                    try {
                        s.push(x);
                    }catch (IntStack.OverFlowIntStackException e){
                        System.out.println("가득참");
                    }
                    break;

                case 2:
                    try{
                        x=s.pop();
                        System.out.print("pop is "+x);
                    }catch (IntStack.EmptyIntStackException e){
                        System.out.print("비어있어요");
                    }
                    break;
                case 3:
                    try{
                        x= s.peek();
                        System.out.print("peek is "+x);
                    }catch (IntStack.EmptyIntStackException e){
                        System.out.print("빔");
                    }break;
                case 4:
                    s.dump();
                    break;
            }
        }
    }
}
