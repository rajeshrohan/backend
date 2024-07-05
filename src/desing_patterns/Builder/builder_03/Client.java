package desing_patterns.Builder.builder_03;

public class Client {
    public static void main(String[] args) {

        Student s =  Student.getBuilder() // gets empty builder obj
                    .setName("rajesh")
                    .setAge(25)
                    .setBatch("june23")
                    .setGradYear(2019)
                    .build();   // return student obj

        // make student constructor private, but then builder can't use
        // so , we will use inner classes , and move builder there
        // inner classes are allowed to be static
        // private can be accessed in inner classes

        // instead of validation in student constructor,
        // take it to build method in builder class, just before student obj creation.

    }
}
