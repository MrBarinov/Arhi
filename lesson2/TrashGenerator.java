public class TrashGenerator extends ItemFabric {

	@Override
	public IGameItem createItem() {
		return new TrashReward();
	}

}
