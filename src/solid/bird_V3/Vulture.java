package solid.bird_V3;

public class Vulture extends Bird implements Flyable {
    FlyingBehaviour f ;
    Vulture(){
        this.f = new FlyingHigh();
    }
    @Override
    public void fly(){
        f.makeFly();
    }
}
