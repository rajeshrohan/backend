package solid.bird_V1;
public class Pigeon extends Bird{
    int price = 10;
    @Override
    public void makeSound(){
        System.out.println("pigeon making sound");
    }
    @Override
    public void  fly(){
        System.out.println("pigeon flying low");
    }
}
