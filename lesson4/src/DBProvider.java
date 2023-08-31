package src;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DBProvider {
	public void connect() {
		System.out.println("Connected");
	}

	public List<Ticket> getData() {
		List<Ticket> result = new ArrayList<>();
		result.add(new BusTicket(1, 150.0, 1, new Date(2023, 9, 5, 10, 0), "Москва", "Коломна"));
		result.add(new BusTicket(2, 150.0, 2, new Date(2023, 9, 5, 10, 0), "Москва", "Коломна"));
		result.add(new BusTicket(3, 150.0, 3, new Date(2023, 9, 5, 10, 0), "Москва", "Коломна"));
		result.add(new BusTicket(4, 150.0, 4, new Date(2023, 9, 5, 10, 0), "Москва", "Коломна"));
		result.add(new BusTicket(5, 150.0, 5, new Date(2023, 9, 5, 10, 0), "Москва", "Коломна"));
		return result;
	}
}
