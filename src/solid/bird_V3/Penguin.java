package solid.bird_V3;

public class Penguin extends Bird implements Flyable {
    @Override
    public void fly(){
        // this is unexpected but forced to be implemented by Bird.
        System.out.println("i am forced to fly , plz help ");
    }
}
