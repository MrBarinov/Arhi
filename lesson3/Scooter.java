package DZ;

public class Scooter extends Car implements IGasStation, ISweepCar {
	private int wheelsCount = 3;

	private String fuelType = "Gas";

	@Override
	public void fogLightActivation() {
		// TODO Auto-generated method stub

	}

	@Override
	public void gearChange() {
		// TODO Auto-generated method stub

	}

	@Override
	public void headlightSwitching() {
		// TODO Auto-generated method stub

	}

	@Override
	public void maintenance() {
		// TODO Auto-generated method stub

	}

	@Override
	public String move() {
		return "Ride";

	}

	@Override
	public void wiperActivation() {
		// TODO Auto-generated method stub

	}

	public int getWheelsCount() {
		return wheelsCount;
	}

	public void setWheelsCount(int wheelsCount) {
		this.wheelsCount = wheelsCount;
	}

	@Override
	public String refueling() {
		return "Бак заправлен бензином";
	}

	@Override
	public void sweepHeadshield() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'sweepHeadshield'");
	}

	@Override
	public void sweepLights() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'sweepLights'");
	}

	@Override
	public void sweepMirrors() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'sweepMirrors'");
	}

}
