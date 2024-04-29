package concurrency.synchronization.sync_keyword;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    private Count count;
    public Adder(Count count){
        this.count = count;
    }
    @Override
    public Void call(){
        for(int i=1; i<=10000; i++){
            synchronized (count) {
                count.val += i;
            }
        }
        return null;
    }
}
