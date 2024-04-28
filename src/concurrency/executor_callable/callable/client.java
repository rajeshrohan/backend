package concurrency.executor_callable.callable;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService ex = Executors.newCachedThreadPool();
        List<Integer> list = List.of(0,2,3,6,3,4,9,8,6);
        Sorter task = new Sorter(list, ex);
        Future<List<Integer>> temp = ex.submit(task);
        List<Integer> temp2 = temp.get();
        System.out.println(temp2);
    }
}

// Executor vs ExecutorService
