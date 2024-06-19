package concurrency.semaphores;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
public class Client {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newCachedThreadPool();
        Store store = new Store(5);
        Semaphore prodSemaphore = new Semaphore(5); // threads
        Semaphore consSemaphore = new Semaphore(0);

        for(int i=1; i<=8; i++)     // 8 producers
            ex.execute(new Producer(store, prodSemaphore, consSemaphore));

        for(int i=1; i<=20; i++)    // 20 consumers
            ex.execute(new Consumer(store, prodSemaphore, consSemaphore));

    }
}
