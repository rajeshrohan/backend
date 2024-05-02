package concurrency.semaphores.example1;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
    private Store store;
    private Semaphore prodSemaphore;
    private Semaphore consSemaphore;
    Consumer(Store store, Semaphore prodSemaphore, Semaphore consSemaphore){
        this.store = store;
        this.prodSemaphore = prodSemaphore;
        this.consSemaphore = consSemaphore;
    }
    @Override
    public void run(){
        while(true){
            try{
                consSemaphore.acquire();
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }
            store.removeItem();
            prodSemaphore.release();
        }
    }


}
