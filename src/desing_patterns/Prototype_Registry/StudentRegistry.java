package desing_patterns.Prototype_Registry;

import java.util.HashMap;

public class StudentRegistry {
    private static HashMap<String, Student> students = new HashMap<>();
    public static void register(String key, Student student){
        students.put(key, student);
    }
    public static Student get(String key){
        return students.get(key).copy();
    }
    public static void fillRegistry(){
        Student dataScienceStudent = new Student();
        dataScienceStudent.type = "DataScience";

        Student frontendStudent = new Student();
        frontendStudent.type = "Frontend";

        Student backendStudent = new Student();
        backendStudent.type = "Backend";

        register(dataScienceStudent.type, dataScienceStudent);
        register(frontendStudent.type, frontendStudent);
        register(backendStudent.type, backendStudent);
    }

}
