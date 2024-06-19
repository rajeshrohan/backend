package solid.bird_V2;

public class Pegion extends Bird implements Flyable {
    FlyingLow f = new FlyingLow();
    @Override
    public void fly(){
        f.makeLowFly();
    }
}
