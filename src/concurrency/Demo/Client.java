package concurrency.Demo;

public class Client {
    public static void main(String[] args) {
        int n = 300;
        for(int i=0; i<n; i++){
            PrintNumbers p = new PrintNumbers(i);
            Thread t = new Thread(p);
            t.start();
            if(i == 200)
                System.out.println("HI");
        }
    }
}
