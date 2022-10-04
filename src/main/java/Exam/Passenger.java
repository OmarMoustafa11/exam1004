package Exam;

public class Passenger extends Person{

    public Passenger(String person) {
        super(person);
    }
    private String luggage;

    public String luggage() {
        return luggage;
    }

    public void setLuggage(String luggage) {
        this.luggage = luggage;
    }

    public Passenger(String person, String luggage) {
        super(person);
        this.luggage = luggage;
    }

    public int getAmtOfLuggage() {
        return luggage.length();
    }
    public static void printTicket(){
        //System.out.println(PlaneTicket());
    }
}
