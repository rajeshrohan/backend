package concurrency.PrintNumbers;
public class Client {
    public static void main(String[] args) {
        for(int i=0; i<100; i++){
            PrintNumbers task = new PrintNumbers(i);
            Thread t = new Thread(task);
            t.start();
        }
    }
}
    // from main thread we are creating multiple thread
    // t.run();   this will run in main thread
    // t.start(); this will run in created thread
    // here nos will not be printed in correct order bcz, for loop is very fast
    // for loop creates task and thread very fast in each iteration , but execution takes time .
    // and cpu randomly picks a thread , executes and print
    // in Multi-Threaded environment, it is undetermined which thread will execute first.
    // order depends on CPU Scheduler Algorithms
