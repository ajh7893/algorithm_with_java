package step04.que;

public class IntArrQueue {
    private int front;
    private int rear;
    private int max;
    private int num;
    private int[] que;

    //큐가 비어있음
    public class EmpintQueException extends RuntimeException{
        public  EmpintQueException(){
        }

    }
    public class OverFlowQueException extends RuntimeException{
        public OverFlowQueException(){}

    }

    public IntArrQueue(int capacity){
        num = front = rear = 0;
        max = capacity;
        try{
            que = new int[max];

        }catch (OutOfMemoryError e){
            max = 0;
        }
    }
    public int queue(int x) throws OverFlowQueException{
        if(num >= max)
            throw new OverFlowQueException();
        que[rear++] = x;
        num++;
        if(rear ==max)
            rear = 0;
        return x;


    }

}
