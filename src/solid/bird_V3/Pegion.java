package solid.bird_V3;

public class Pegion extends Bird implements Flyable {
    FlyingBehaviour f;
    Pegion(){
        this.f = new FlyingLow();
    }
    @Override
    public void fly(){
        f.makeFly();
    }
}
