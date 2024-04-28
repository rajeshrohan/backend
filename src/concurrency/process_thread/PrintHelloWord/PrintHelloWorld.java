package concurrency.process_thread.PrintHelloWord;
public class PrintHelloWorld implements Runnable{
    @Override
    public void run(){
        System.out.println("printHelloWorld thread name : "+Thread.currentThread().getName());
    }

}
