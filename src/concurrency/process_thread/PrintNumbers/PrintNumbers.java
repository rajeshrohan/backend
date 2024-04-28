package concurrency.process_thread.PrintNumbers;
public class PrintNumbers implements Runnable{
    int noToPrint;
    public PrintNumbers(int noToPrint) {
        this.noToPrint = noToPrint;
    }
    @Override
    public void run() {
        System.out.println("number : "+noToPrint+" thread : "+Thread.currentThread().getName());
    }
}

