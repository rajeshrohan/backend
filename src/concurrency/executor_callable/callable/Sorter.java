package concurrency.executor_callable.callable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {
    private List<Integer> list;
    private ExecutorService ex;
    public Sorter(List<Integer> list, ExecutorService ex){
        this.list = list;
        this.ex = ex;
    }
    @Override
    public List<Integer> call() throws Exception {
        if(list.size() <= 1 )
            return list;
        int mid = list.size()/2;
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for(int i=0; i<mid ; i++)
            left.add(list.get(i));

        for(int i=mid; i<list.size(); i++)
            right.add(list.get(i));

        Sorter task1 = new Sorter(left, ex);
        Sorter task2 = new Sorter(right, ex);

        Future<List<Integer>> leftSorted = ex.submit(task1);
        Future<List<Integer>> rightSorted = ex.submit(task2);
        left = leftSorted.get();
        right = rightSorted.get();

        List<Integer> finalArray = new ArrayList<>();
        int i=0, j=0;
        while(i < left.size() && j<right.size()){
            if(left.get(i) < right.get(j))
                finalArray.add(left.get(i++));
            else
                finalArray.add(right.get(j++));
        }
        while(i<left.size())
            finalArray.add(left.get(i++));
        while ((j<right.size()))
            finalArray.add(right.get(j++));

        return finalArray;
    }
}

// Future is like promise
// get is like  wait

// recursion needs multiple threads, so use newCachedThreadPool();
