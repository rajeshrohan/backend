package concurrency.PrintNumbers;
public class PrintNumbers implements Runnable{  //creating a task
    int noToPrint;
    public PrintNumbers(int noToPrint) {
        this.noToPrint = noToPrint;
    }   @Override
    public void run() {
        System.out.println("number : "+noToPrint+" thread : "+Thread.currentThread().getName());
    }

}
//creating a task, which implements Runnable interface and implements run method.
