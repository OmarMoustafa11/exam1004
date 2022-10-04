package Exam;

public class CrewMember extends Person implements Payable {
    private float salary;

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public CrewMember(String person, float salary) {
        super(person);
        this.salary = salary;
    }

    public CrewMember(String person) {
        super(person);
    }
    CrewMember crewMember1 = new CrewMember("Omizz",100000.0f);
    CrewMember crewMember2 = new CrewMember("Billy",9000.0f);
    CrewMember crewMember3 = new CrewMember("Mike Jones",7000.0f);

}
