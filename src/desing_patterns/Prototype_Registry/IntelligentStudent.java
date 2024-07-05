package desing_patterns.Prototype_Registry;

public class IntelligentStudent extends Student{
    int iq;
    public IntelligentStudent(){

    }
    public IntelligentStudent(IntelligentStudent copy){
        super(copy);
        this.iq = copy.iq;
    }
    public IntelligentStudent copy (){
        IntelligentStudent copy = new IntelligentStudent(this);
        return copy;
    }
}
