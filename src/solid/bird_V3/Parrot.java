package solid.bird_V3;
public class Parrot extends Bird implements Flyable {
    FlyingBehaviour f;
    Parrot(){
        this.f = new FlyingLow();
    }
    @Override
    public void fly(){
        f.makeFly();
    }
}
