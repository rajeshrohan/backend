package concurrency.Demo;

public class PrintNumbers implements Runnable {
    int num ;
    PrintNumbers(int num){
        this.num = num;
    }
    @Override
    public void run() {
        System.out.println(num+" "+Thread.currentThread().getName());
    }
}
