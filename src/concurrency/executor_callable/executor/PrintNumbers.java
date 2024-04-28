package concurrency.executor_callable.executor;
public class PrintNumbers implements Runnable{
    int noToPrint;
    @Override
    public void run(){
        System.out.println(noToPrint+" "+ Thread.currentThread().getName());
    }
    public PrintNumbers(int n){
        this.noToPrint = n;
    }
}
