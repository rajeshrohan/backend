package desing_patterns.Builder.builder_01;
public class Client {
    public static void main(String[] args) {
        Builder b = new Builder();
        b.setName("rajesh");
        b.setAge(25);
        b.setBatch("june23");
        b.setGradYear(2019);

        Student s = new Student(b);

        // student has one constructor only
        // client is creating builder himself
        // but client don't know there is builder also
        // they are two diff things, no Cohesion


    }
}
