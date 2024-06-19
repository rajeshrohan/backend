package solid.bird_V1;
public class Main {
    public static void main(String[] args) {
        Eagle b = new Eagle();
        b.eat();
        b.fly();
        System.out.println(b.price);
    }
}
// if we take Bird reference type, then error, and it violates LSP.
// if we implement penguin, but it should not implement fly right. but here forcefully.??


// temp Sol: leave empty / throw exception , but not a good idea
// bird abstract , extends abstract flyable bird & unFlyable bird ,
// but leads to class explosion. as 2^n class formation for n variations.

// boolean variable for verified , unverified , not a good idea.
// if blocked comes it will break , so use enums instead.