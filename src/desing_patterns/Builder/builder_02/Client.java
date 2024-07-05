package desing_patterns.Builder.builder_02;
public class Client {
    public static void main(String[] args) {

        Student s =  Student.getBuilder() // gets empty builder obj
                    .setName("rajesh")
                    .setAge(25)
                    .setBatch("june23")
                    .setGradYear(2019)
                    .build();   // return student obj

        // client ask student to give its builder
        // introduce chaining
        // every setter in builder, after setting, needs to return same obj.
        // build method in builder, itself gives student obj
        // but no one is stopping to do new Student(); ??

    }
}
