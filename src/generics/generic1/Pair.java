package generics.generic1;
public class Pair<V, S> {
    V first;
    S second;
    public <V> void doSomething(V val){
        System.out.println(val);
    }
    // this V generic , hides class level V type

    public <T> void doingSomething(T val){
        System.out.println(val);
    }
    // generics at method level are local to declaration.
}
