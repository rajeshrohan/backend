package solid.bird_V3;

public class Main {
    public static void main(String[] args) {
        Bird e = new Eagle();
        e.fly();

        Bird p = new Parrot();
        p.fly();

        Bird penguin = new Penguin();   // this should not implement fly , but forced by abstract bird.
        penguin.fly();

    }
}
// object of any subclass should be as it is substitutable in parent class itself.

// FlyingBehaviour is interface having makeFly method.
// FlyingHigh and FlyingLow are classes implementing FlyingBehaviour , @makeFly.

// Flyable interface has fly method.
// here creating obj of flyingHigh or low and calling their fn, inside .

// this way code reusability is improved.


// Rbi has interface
// different bank has interfaces implementing RBI.
// so, we are not dependent on diff banks , instead we can use RBI objects to perform operation.