public class ShieldGenerator extends ItemFabric {

	@Override
	public IGameItem createItem() {
		return new ShieldReward();
	}

}
