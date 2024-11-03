package Lab3Task3;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer("A001", "Umer", "Gulshan", 1234567890, 30);
        customer.addDetails();

        Agent agent = new Agent(101, "Taqiullah");
        agent.searchTicket();
        agent.bookTicket();

        BookingCounter bookingCounter = new BookingCounter();
        bookingCounter.processRequest();

        Ticket ticket = new Ticket("Karachi", "Islamabad", new Date(), "10:00 AM", "B123", "A1");
        ticket.printTicketDetails();

        Refund refund = new Refund(150.0f, customer.getCustId());
        refund.refundAmount();

	}

}
