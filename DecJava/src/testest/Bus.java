package testest;

public class Bus {
	String busNumber;// 버스번호
	int charge;// 요금
	int income;// 버스 수입
	int count;// 버스 누적 승객 수

	public Bus(String busNumber, int charge) {
		super();
		this.busNumber = busNumber;
		this.charge = charge;
	}
	//승객을 태운다.
	public void take() {
		income += charge;
		count++;

	}

	// 버스 상태를 출력한다.
	public void showinfo() {
		System.out.printf("%s번 버스의 승객은 %d명이고 수입은 %d입니다.\n", 
				busNumber, count, income);
	}

}
