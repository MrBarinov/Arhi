import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
	public static void main(String[] args) {
		Random rnd = ThreadLocalRandom.current();
		List<ItemFabric> fabricList = new ArrayList<>();

		fabricList.add(new GoldGenerator());
		fabricList.add(new GemGenerator());
		fabricList.add(new SwordGenerator());
		fabricList.add(new ShieldGenerator());
		fabricList.add(new HelmGenerator());
		fabricList.add(new TrashGenerator());

		for (int i = 0; i < 20; i++) {
			int index = Math.abs(rnd.nextInt() % 10);
			if (index > 5) {
				index = 5;
			}
			ItemFabric fabric = fabricList.get(index);
			fabric.openReward();
		}
	}
}
