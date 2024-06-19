package solid.bird_V2;
public class Main {
    public static void main(String[] args) {
        Bird b = new Eagle();
        b.fly();
    }


}
// object of any subclass should be as it is substitutable in parent class itself.

// Bird is abstract, fly method is abstract
// flyable interface have fly method
// we have two classes FlyingLow and FlyingHigh
// each bird type will create obj of flying low or high, and in fly method call the func.

// problem is when bird don't fly   or a bird want to try medium or other way.

// extending bird abstract makes subclass mandatory to implement fly method.
// which should not be there in case of penguin
