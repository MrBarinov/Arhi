package src;

import java.util.HashMap;

public class Bank {
	private HashMap<Long, Double> cards;

	public Bank() {
		cards = new HashMap<Long, Double>();
		cards.put(1111111111l, 100d);
		cards.put(2222222222l, 200d);
		cards.put(3333333333l, 300d);
		cards.put(4444444444l, 400d);
		cards.put(5555555555l, 500d);
		cards.put(6666666666l, 600d);
		cards.put(7777777777l, 700d);
	}

	public double getBalance(long card) {
		return this.cards.get(card);
	}

	public void setBalance(Long card, Double value) {
		this.cards.put(card, value);
	}
}
