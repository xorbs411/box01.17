package constructor.day0111;
////////////////// 오늘집가서 복습+ 채우기!!!!!!!!!!!!!!!!!!!!!!!!!////////////////






public class Car2 {
	String color;
	String gearType;
	int door;
	
	Car2(String c){
	
		this("white","auto",4);
	}
	
	Car2(){
		color = "white";
		gearType = "auto";
		door =4;
		//this("white", "auto",4);
			
	}
	
	
	Car2(String color, String gearType, int door) {
		this.color  = color;
		this.gearType = gearType;
		this.door = door;
	}
	void printCar() {
		System.out.printf("색상 : %s, 기어타입 : %s, 문: %d\n", color, gearType, door);
	}





	public static void main(String[] args) {
		//Car2 c1 = new Car2();
		//Car2 c2 = new Car2("red");
		//Car2 c3 = Car2("black"," auto", 4);
		
		//c1.printCar();
		//c2.printCar();
		//c3.printCar();
		
		

	}

}
