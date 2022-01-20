package interfaceex.day0119;

public class Circle {
	double radius;
	static final double PI = 3.141592;

	Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getArea() {
		return radius * radius * PI;

	}

}
