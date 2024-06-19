package concurrency.semaphores;

import java.util.concurrent.Semaphore;

public class Producer implements  Runnable{
    private Store store;
    private Semaphore prodSemaphore;
    private Semaphore consSemaphore;
    Producer(Store st, Semaphore prodSemaphore, Semaphore consSemaphore){
        this.store = st;
        this.prodSemaphore = prodSemaphore;
        this.consSemaphore = consSemaphore;
    }
    @Override
    public void run(){
        while(true){
            try{
                prodSemaphore.acquire();
            } catch (Exception InterruptedException){

            }
            store.addItem();
            consSemaphore.release();
        }
    }

}
