package testest;

public class Subway {
	String lineNumber;
	int count;
	int income;
	int charge;
	public Subway(String lineNumber, int charge) {
		super();
		this.lineNumber = lineNumber;
		this.charge = charge;
	}
	
	void take() {
		count++;
		income +=charge;
		
	}
	public void showinfo() {
		System.out.printf("%s노선의 승객은 %d명이고 수입은 %d입니다.\n", 
				lineNumber, count, income);
	}

}
