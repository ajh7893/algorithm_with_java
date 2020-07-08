package step04.stack;

public class IntStack {
    //스택은 데이터를 일시적으로 저장하기 위해 사용하는 자료구조
    //데이터의 입력과 출력 순서는 후입선출이며,
    //스택에 데이터를 넣는 작업을 push, 꺼내는 작업을 pop라고한다.
    //stack은 마른풀을 쌓은 더미, 겹겹이 쌓음이라는 뜻이다. 그래서 푸시를 쌓기라고도 한다.

    int max;    //스택 용량
    int ptr;    //스택 포인터
    int[] stk;  //스택의 본체

    //실행시 예외처리: 스택이 비어있을때.
    public class EmptyIntStackException extends RuntimeException{
        public EmptyIntStackException() {}
        }

    //실행시 예외처리: 스택이 가득 참
    public class OverFlowIntStackException extends RuntimeException{
        public OverFlowIntStackException(){}
        }

    public IntStack(int capacity) {
        /*생성자는 스택 본체용 배열을 생성하는 등 준비 작업을 수행. 생성 시 스택은 비어 있으므로 스택포인터 ptr값을 0으로 한다.*/
        /*매개변수 capacity로 전달받은 값을 스택 용량을 나타내는 max에 복사하고 요솟수가 max인 배열 stk의 본체를 생성한다.
        * 따라서 스택 본체의 개별 요소는 바닥부터 stk[0], stk[1]...stk[max-1]이 된다.*/
        ptr = 0;
        max = capacity;
        try {
            stk = new int[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    public int push(int x) throws OverFlowIntStackException{
        /*스택에 데이터를 푸시하는 메서드다. 스택이 가득 차서 푸시할 수 없는 경우 예외를 던진다.
        * 새로운 인덱스를 기억하는 용도이다.
        * 전달받은 x를 배열 요소 stk[ptr]에 저장하고, 스택 포인터를 증가한다.*/
        if(ptr>= max)
            throw new OverFlowIntStackException();
        return stk[ptr++]=x;

        }
    public int pop() throws OverFlowIntStackException{
        /*스택의 꼭대기에서 데이터를 팝하고 그 값을 반환하는 메서드. 스택이 비어있어 팝을 할수없는경우 예외를 던진다.
        * 스택 포인터를 감소시키고 그때 stk[ptr]에 저장되어있는 값을 반환한다.*/
        if(ptr<= 0)
            throw new OverFlowIntStackException();
        return stk[--ptr];

    }
    public int peek() throws EmptyIntStackException{
        /*스택의 꼭대기에 있는 데이터를 몰래 엿보는 메서드
        * 스택이 비어있는경우 예외처리 를 던진다.*/
        if(ptr <=0)
            throw new EmptyIntStackException();
            return stk[ptr-1];

    }
    /*검색 매서드*/
    public int indexOf(int x){
        for(int i = ptr -1; i >=0; i--)
            if(stk[i]==x)
                return i;
        return -1;
    }
    //초기화.
    public void clear(){
        ptr=0;
    }
    //용량을 반환한다.
    public int capacity(){
        return max;
    }
    //스택에 쌓여 있는 대이터 수를 반환
    public int size(){
        return ptr;

    }
    //비어있는지?
    public boolean inEmpty(){
        return ptr<=0;
    }
    //가득 찼는지?
    public boolean isFull(){
        return ptr >= max;
    }
    //스택안에 모든 데이터를 바닥부터 꼭대기까지 순서로 출력
    public void dump(){
        if(ptr<=0)
            System.out.print("비어잇음");
        else
            for(int i =0; i<ptr; i++)
            System.out.print(stk[i]);
        System.out.println();
    }
    }


