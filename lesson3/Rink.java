package DZ;

public class Rink extends Car implements IGasStation, ISweepCar {

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

	@Override
	public void fogLightActivation() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'fogLightActivation'");
	}

	@Override
	public String refueling() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'Refueling'");
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
