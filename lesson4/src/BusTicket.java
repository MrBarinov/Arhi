package src;

import java.util.Date;

public class BusTicket extends Ticket {
	public String departure;
	public String destination;

	public BusTicket(long rootNumber, double price, int place, Date date, String departure, String destination) {
		super(rootNumber, price, place, date);
		this.departure = departure;
		this.destination = destination;
	}
}
