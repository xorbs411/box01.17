package interfaceex.day0119;

public class CylinderTest {

	public static void main(String[] args) {
		Circle c = new Circle(2.8);
		Cylinder cy1 = new Cylinder(c, 5.6);

		double volume = cy1.getVolume();
		System.out.println("원통의 부피: volume");

	}

}
