package desing_patterns.Prototype_Registry;

public class Student implements Prototype<Student> {
    int id;
    String name;
    String batch;
    String type;

    public Student(){

    }
    public Student(Student st){
        this.id = st.id;
        this.name = st.name;
        this.batch = st.batch;
        this.type = st.type;
    }

    @Override
    public Student copy(){
        Student st = new Student(this);
        return st;
    }
}
