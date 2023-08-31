package src;

import java.util.Date;

public class Ticket {
	public long rootNumber;
	public double price;
	public int place;
	public Date date;
	public boolean isValid;

	public Ticket(long rootNumber, double price, int place, Date date) {
		this.rootNumber = rootNumber;
		this.price = price;
		this.place = place;
		this.date = date;
		this.isValid = false;
	}

}