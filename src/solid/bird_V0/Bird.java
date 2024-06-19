package solid.bird_V0;

public class Bird {
    String name;
    String color;
    int size;
    int weight;
    public void makeSound(){
        if(name.equals("crow"))
            System.out.println("Coow-Coow");
        else if(name.equals("pigeon"))
            System.out.println(("Gutur-Gutur"));
    }
    public void eat(){
        // eating code
    }
    public  void fly(){
        // flying code
    }
}

// SRP violate = make sound, two responsibility   = check , sound
// OCP violate = if a new bird added which is new = change in all methods fly, eat , sound
