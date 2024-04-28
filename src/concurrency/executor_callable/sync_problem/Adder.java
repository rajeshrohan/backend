package concurrency.executor_callable.sync_problem;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    private Count count;
    public Adder(Count count){
        this.count = count;
    }
    @Override
    public Void call(){
        for(int i=1; i<=10000; i++)
            count.val += i;
        return null;
    }
}
