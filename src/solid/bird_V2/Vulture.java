package solid.bird_V2;
public class Vulture extends Bird implements Flyable {
    FlyingHigh obj = new FlyingHigh();
    @Override
    public void fly(){
        obj.makeHighFly();
    }
}
