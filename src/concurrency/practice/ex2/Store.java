package concurrency.practice.ex2;

import java.util.concurrent.ConcurrentLinkedDeque;

public class Store {
    int maxCapacity;
    ConcurrentLinkedDeque<Integer> items ;
    public Store(int size){
        this.maxCapacity = size;
    }
}
