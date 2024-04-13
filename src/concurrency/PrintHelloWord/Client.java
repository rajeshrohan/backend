package concurrency.PrintHelloWord;

import concurrency.PrintHelloWord.PrintHelloWorld;

public class Client {
    public static void main(String[] args) {
        //System.out.println("Thread Name : "+Thread.currentThread().getName());
        PrintHelloWorld task = new PrintHelloWorld();
        // task.run();     // will run in main thread

        Thread t1 = new Thread(task);   // new thread create
        t1.start();                     // submit
        doSomething();
    }
    public static void doSomething(){
        System.out.println("dosomething thread name : "+ Thread.currentThread().getName());
    }

}
