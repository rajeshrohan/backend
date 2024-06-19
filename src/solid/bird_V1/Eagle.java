package solid.bird_V1;
public class Eagle extends Bird{
    int price = 100;
    @Override
    public void makeSound() {
        System.out.println("Eagle making sound");
    }
    @Override
    public void fly() {
        System.out.println("Eagle flying high");
    }
}
