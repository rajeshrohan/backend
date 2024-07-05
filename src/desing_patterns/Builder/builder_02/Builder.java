package desing_patterns.Builder.builder_02;

public class Builder {
    String name;
    int age;
    int gradYear;
    String batch;
    public Student build(){
        return new Student(this);
    }
    public Builder setName(String name) {
        this.name = name;
        return this;    // returns obj
    }
    public Builder setAge(int age) {
        this.age = age;
        return this;
    }
    public Builder setGradYear(int gradYear) {
        this.gradYear = gradYear;
        return this;
    }
    public Builder setBatch(String batch) {
        this.batch = batch;
        return this;
    }

}


