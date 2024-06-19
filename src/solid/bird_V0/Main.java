package solid.bird_V0;
public class Main {
    public static void main(String[] args) {
        Bird pigeon = new Bird();
        pigeon.name = "pigeon";
        Bird crow = new Bird();
        crow.name = "crow";

        pigeon.makeSound();
        crow.makeSound();
    }
}
