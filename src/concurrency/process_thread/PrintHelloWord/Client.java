package concurrency.process_thread.PrintHelloWord;
public class Client {
    public static void main(String[] args) {
        PrintHelloWorld task = new PrintHelloWorld();
        Thread t1 = new Thread(task);
        t1.start();

        doSomething();
    }
    public static void doSomething(){
        System.out.println("doSomething thread name : "+ Thread.currentThread().getName());
    }
}

//        PrintHelloWorld task = new PrintHelloWorld();
//        task.run();   // calling run method directly

//        PrintHelloWorld task = new PrintHelloWorld();
//        Thread t1 = new Thread(task);
//        t1.start();   // calling run method using thread
