package ModelElements;

import Stuff.Angle3D;
import Stuff.Point3D;
import Stuff.Color;

public class Flash {
	public Point3D Location;
	public Angle3D Angle;
	public Color Color;
	public Float Power;

	public Flash(Point3D loc, Angle3D angle, Color color, Float power) {
		this.Location = loc;
		this.Angle = angle;
		this.Color = color;
		this.Power = power;
	}

	public void Rotate(Angle3D angle) {

	}

	public void Move(Point3D point) {

	}
}
