package solid.bird_V1;
public abstract class Bird {
    String name;
    String color;
    int size;
    int weight;
    public void eat(){
        System.out.println("Bird is eating");
    }
    public abstract void makeSound();
    public abstract void fly();
}

