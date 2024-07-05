package desing_patterns.Builder.builder_03;

public class Student {
    String name;
    int age;
    int gradYear;
    String batch;

    private Student(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.gradYear = builder.gradYear;
        this.batch = builder.batch;
    }
    public static Builder getBuilder(){
        return  new Builder();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public static class Builder {
        String name;
        int age;
        int gradYear;
        String batch;
        public Student build(){
            if(age < 25){
                throw new RuntimeException();
            }
            if(gradYear < 2019){
                throw  new RuntimeException();
            }
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
}
