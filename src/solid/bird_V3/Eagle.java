package solid.bird_V3;

public class Eagle extends Bird implements Flyable {
//    FlyingHigh f  = new FlyingHigh();
//    now FlyBehaviour has access to both flyingHigh or flyingLow
    FlyingBehaviour f;
    Eagle(){
        this.f = new FlyingHigh();
    }
    Eagle(FlyingBehaviour f){
        this.f = f;
    }
    // expecting the type from client , this is top level abstraction called dependency injection.
    @Override
    public void fly(){
        f.makeFly();
    }
}
