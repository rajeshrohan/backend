package solid.bird_V2;
public class Eagle extends Bird implements Flyable {
    FlyingHigh f  = new FlyingHigh();
    @Override
    public void fly(){
        f.makeHighFly();
    }
}
