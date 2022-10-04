package Exam;

public class main {
    public static void main(String[] args) {
        FlightCrewJob FlightCrewJob1 = FlightCrewJob.FLIGHT_ATTENDANT;
        FlightCrewJob FlightCrewJob2 = FlightCrewJob.CO_PILOT;
        FlightCrewJob FlightCrewJob3 = FlightCrewJob.PILOT;

        CrewMember crewMember1 = new CrewMember("Omizz",100000.0f);
        CrewMember crewMember2 = new CrewMember("Billy",9000.0f);
        CrewMember crewMember3 = new CrewMember("Mike Jones",7000.0f);

        Passenger passenger57 = new Passenger("");
        Passenger passenger07 = new Passenger("");

        BusTicket TicketInfo = new BusTicket (010,"PHl","Mia","32C",50.0);
        PlaneTicket TicketInfo2 = new PlaneTicket(210,"JFK","LAX","24B",100.0);

        String[] passanger57Luggage = {"Luggage1","Luggage2","Luggage3"};
        String[] passanger07Luggage = {"Luggage1","Luggage2"};



    }
}
