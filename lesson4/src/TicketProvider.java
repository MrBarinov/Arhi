package src;

import java.util.ArrayList;
import java.util.List;

public class TicketProvider {
	public List<Ticket> getTicket(long rootNumber) {
		List<Ticket> result = new ArrayList<>();
		DBProvider db = new DBProvider();
		db.connect();
		for (Ticket ticket : db.getData()) {
			if (ticket.rootNumber == rootNumber) {
				result.add(ticket);
			}
		}
		return result;
	}

	public boolean updateTicketStatus(Ticket ticket) throws Exception {
		if (!ticket.isValid) {
			ticket.isValid = true;
			return ticket.isValid;
		}
		throw new Exception("Билет уже куплен!");
	}
}
