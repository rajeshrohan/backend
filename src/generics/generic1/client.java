package generics.generic1;

public class client {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>();

        pair.doSomething(25);

        pair.<String>doingSomething("rajesh");
        // optional to tell data type

    }
}
