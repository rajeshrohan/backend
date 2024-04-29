package concurrency.synchronization.mutex;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    private Count count;
    private Lock lock;
    public Adder(Count count, Lock lock){
        this.count = count;
        this.lock = lock;
    }
    @Override
    public Void call(){
        for(int i=1; i<=10000; i++){
            lock.lock();
            count.val += i;
            lock.unlock();
        }
        return null;
    }
}