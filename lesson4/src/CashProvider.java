package src;

public class CashProvider {
	public long card;
	public long hashCard;
	public boolean isAuthorized;

	public CashProvider(long card) {
		this.card = card;
		this.hashCard = (String.valueOf(card)).hashCode();
		this.isAuthorized = false;
	}

	public void buy(double price) throws Exception {
		Bank bank = new Bank();
		double cash = bank.getBalance(this.card);
		if (price < cash) {
			cash -= price;
			bank.setBalance(this.card, cash);
		} else {
			throw new Exception("Недостаточно средств для покупки билета");
		}
	}

	public void authorization() {
		if (!this.isAuthorized) {
			this.isAuthorized = true;
		}
	}
}
