package constructor.day0111;

class Car1{
	String color;
	String gearType;
	int door;
	
	Car1(){}// 기본 생성자
	Car1(String c, String g, int d){
		color =c;
		gearType = g;
		door = d;
		
		
	}
	
	
}

public class CarTest1 {

	public static void main(String[] args) {
		Car1 c1 =new Car1(){};
		c1.color ="white";
		c1.gearType ="auto";
		c1.door =4;
		
		Car1 c2 = new Car1("black","auto",2);

	}

}
