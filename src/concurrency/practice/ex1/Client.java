package concurrency.practice.ex1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newCachedThreadPool();
        for(int i=0; i<10; i++){
            PrintHello task = new PrintHello(i);
            ex.submit(task);
            }
        }
}
