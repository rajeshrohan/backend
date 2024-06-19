package concurrency.semaphores;

import java.util.concurrent.ConcurrentLinkedDeque;

public class Store {
    private  int maxSize;
    private ConcurrentLinkedDeque<Object> items;
    public Store(int maxSize){
        this.maxSize = maxSize;
        this.items = new ConcurrentLinkedDeque<>();
    }
    public int getMaxSize(){
        return maxSize;
    }
    public ConcurrentLinkedDeque<Object> getItems(){
        return items;
    }
    public void addItem(){
        System.out.println("producer production time, current size "+this.items.size());
        this.items.add(new Object());
    }
    public void removeItem(){
        System.out.println("consumer consuming time, current Size "+ this.items.size());
        this.items.remove();
    }
}
