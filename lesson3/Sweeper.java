package DZ;

public class Sweeper extends CarSweep implements IGasStation, ISweepCar {

	@Override
	public void gearChange() {
		// TODO Auto-generated method stub
		super.gearChange();
	}

	@Override
	public void headlightSwitching() {
		// TODO Auto-generated method stub
		super.headlightSwitching();
	}

	@Override
	public void maintenance() {
		// TODO Auto-generated method stub
		super.maintenance();
	}

	@Override
	public String move() {
		return "Ride";
	}

	@Override
	public void sweepStreet() {
		// TODO Auto-generated method stub
		super.sweepStreet();
	}

	@Override
	public void wiperActivation() {
		// TODO Auto-generated method stub
		super.wiperActivation();
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
