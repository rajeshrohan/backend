package generics.generic2;
import java.util.*;
public class Client {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        doSomething(dogs);
        doSomething1(dogs);
        // doSomething2(dogs);
        randomMethod(new Dog());
    }
    public static <T extends Animal> void doSomething(List<T> animals){

    }
    public static void doSomething1(List<? extends Animal> animals){
        for(Animal animal : animals)
            System.out.println(animal.getClass().getName());

//        animals.add(new Dog());
//        animals.add(new Cat());
//        animals.add(new Animal());
//        adding all this will give error,  don't add random.
//        accept anything related to animal , but only one type.
    }
    public static void doSomething2(List<Animal> animals){
        // by default , it will accept only animal, not dog, or cat.
        // unless you be generic to take only one type of any .
        for(Animal animal : animals)
            System.out.println(animal.getClass().getName());

        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Animal());
        // here we can add , as we are being specific.
    }
    public static  void randomMethod(Animal animal){

    }
}
