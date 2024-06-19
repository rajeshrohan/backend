package solid.bird_V2;
public abstract class Bird {
    String name;
    String Color;
    int size;
    int weight;
    public void eat(){
        System.out.println("Bird is eating");
    }
    public abstract void fly();
}
