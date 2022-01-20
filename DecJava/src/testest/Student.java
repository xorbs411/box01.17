package testest;

public class Student {
	String name;
	int grade;
	int money;
	
	public Student(String name, int grade, int money) {
		super();
		this.name = name;
		this.grade = grade;
		this.money = money;
	}
	//버스를 탄다. 
	public void takeBus(Bus bus) {
		System.out.println(name+"이 "+bus.busNumber+"버스에 탑승합니다.");
		money -= bus.charge;
		bus.take();
	}
	//지하철을 탄다
	public void takeSubway(Subway subway) {
		System.out.println(name+"이 지하철을 탑니다.");
		money -= subway.charge;
		subway.take();
	}
	public void show() {
		System.out.println(name+"의 용돈이 "+money+"만큼 남았습니다.");
	}
	
}
	


