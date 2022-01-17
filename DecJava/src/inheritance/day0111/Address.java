package inheritance.day0111;

public class Address  {
	String postcode;
	String area1;
	String area2;
	
	Address(){}
	
	
	
	

	Address(String postcode, String area1, String area2) {
		this.postcode = postcode;
		this.area1 = area1;
		this.area2 = area2;
	}
	
	@Override // object클래스로 부터 물려받은 toString()오버라이딩
	public String toString() {
		return "Address [postcode=" + postcode + ", area1=" + area1 + ", area2=" + area2 + "]";
	}





	public static void main(String[] args) {
		

	}

}
