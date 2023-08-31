package src;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Customer {
	public int id;
	public List<Ticket> tickets;
	public CashProvider cash;

	public Customer(int id, long card) {
		this.id = id;
		this.tickets = new ArrayList<>();
		this.cash = new CashProvider(card);
	}

	public boolean buyTicket(Ticket ticket) throws Exception {
		if (cash.isAuthorized) {
			cash.buy(ticket.price);
			tickets.add(ticket);
			return true;
		}
		return false;
	}

	public List<Ticket> search(Date date, long rootNumber) {
		List<Ticket> found = new ArrayList<>();
		for (Ticket ticket : this.tickets) {
			if (ticket.date.equals(date) && ticket.rootNumber == rootNumber) {
				found.add(ticket);
			}
		}
		return found;
	}
}
