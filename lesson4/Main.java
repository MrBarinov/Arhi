import src.Customer;
import src.Ticket;
import src.TicketProvider;

public class Main {
	public static void main(String[] args) {
		int id = 1;
		long card = 3333333333l;
		int ticketNum = 3;
		Customer customer = new Customer(id, card);
		TicketProvider provider = new TicketProvider();

		for (Ticket ticket : provider.getTicket(ticketNum)) {
			try {
				if (provider.updateTicketStatus(ticket)) {
					customer.cash.authorization();
					if (customer.buyTicket(ticket)) {
						System.out.println("Билет успешно куплен");
					}
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
