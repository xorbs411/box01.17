package poly.day0118;

class CastingTest2 {
	public static void main(String args[]) {
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;
  
		car.drive();
		fe = (FireEngine)car;//error FireEngine fe = new Car();
		fe.drive();
		car2 = fe;
		car2.drive();
	}
}