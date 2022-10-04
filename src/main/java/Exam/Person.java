package Exam;

public class Person {
    private String name;
    public String Person;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", Person='" + Person + '\'' +
                '}';
    }

    public Person(String person) {
        Person = person;
    }
}
