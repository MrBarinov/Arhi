

import java.awt.*;

public abstract class Car {
	protected String brand;
	protected String model;
	protected Color color;
	protected String bodyType;
	protected int wheelsCount;
	protected String fuelType;
	protected String transmissionType;
	protected double engineCapacity;

	public abstract String move();

	public abstract void maintenance();

	public abstract void gearChange();

	public abstract void headlightSwitching();

	public abstract void wiperActivation();

	public abstract void fogLightActivation();
}
