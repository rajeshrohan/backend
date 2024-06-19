package solid.bird_V2;

public class Parrot extends Bird implements Flyable {
    FlyingLow f = new FlyingLow();
    @Override
    public void fly(){
        f.makeLowFly();
    }
}
