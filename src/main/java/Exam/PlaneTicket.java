package Exam;

public class PlaneTicket extends Ticket{
    public PlaneTicket(int id, String origin, String destination, String seatNumber, double price) {
        super(id, origin, destination, seatNumber, price);
    }
    PlaneTicket TicketInfo = new PlaneTicket(210,"JFK","LAX","24B",100);

    protected boolean isFrequentFlyer;
}
