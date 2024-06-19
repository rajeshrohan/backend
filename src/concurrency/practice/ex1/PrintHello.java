package concurrency.practice.ex1;

public class PrintHello implements Runnable{
    int n;
    public PrintHello(int n){
        this.n = n;
    }
    @Override
    public void run(){
        System.out.println(n+" " + Thread.currentThread().getName());
    }
}


