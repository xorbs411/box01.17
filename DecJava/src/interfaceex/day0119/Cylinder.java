package interfaceex.day0119;

public class Cylinder {
	Circle circle;
	double height;

	public Cylinder(Circle circle, double height) {
		super();
		this.circle = circle;
		this.height = height;
	}

	public double getVolume() {
		return circle.getArea() * height;
	}

}
