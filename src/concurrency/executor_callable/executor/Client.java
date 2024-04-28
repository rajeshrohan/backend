package concurrency.executor_callable.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Client {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newCachedThreadPool();
        for(int i=0; i<=1000; i++){
            if( i == 500)
                System.out.println(i);
            PrintNumbers task = new PrintNumbers(i);
            ex.submit(task);
        }
    }
}

// ExecutorService ex = Executors.newCachedThreadPool();
// ExecutorService ex = Executors.newFixedThreadPool(10);

