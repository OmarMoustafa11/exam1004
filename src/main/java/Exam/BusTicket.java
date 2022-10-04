package Exam;

public class BusTicket extends Ticket{
    public BusTicket(int id, String origin, String destination, String seatNumber, double price) {
        super(id, origin, destination, seatNumber, price);
    }
    BusTicket TicketInfo = new BusTicket (010,"PHl","Mia","32C",50.0);
}
