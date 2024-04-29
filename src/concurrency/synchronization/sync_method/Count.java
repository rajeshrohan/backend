package concurrency.synchronization.sync_method;

public class Count {
    public  int val = 0;
    public synchronized void  incrementByX(int x){
        val += x;
    }
    public synchronized void decrementByX(int x){
        val -= x;
    }

}
