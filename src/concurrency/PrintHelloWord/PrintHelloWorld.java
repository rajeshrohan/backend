package concurrency.PrintHelloWord;


public class PrintHelloWorld implements Runnable{
    @Override
    public void run(){
        System.out.println("printhelloworld thread name : "+Thread.currentThread().getName());
    }

}
// 1. Define task first            =    which is a class, implements Runnable Interface.
// 2. Decide how thread to create
// when we create a task it should implement Runnable interface, and implement run method.
