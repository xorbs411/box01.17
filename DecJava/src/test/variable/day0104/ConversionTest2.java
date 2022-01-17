package test.variable.day0104;

public class ConversionTest2 {

	public static void main(String[] args) {
		
		byte b = 100;
		int i = b;//byte -> int
		
		System.out.println("b : "+b);
		System.out.println("i : "+i);
		
		int i2 = 300;
		byte b2 = (byte)i2; //데이터의 손실이 발생해도 byte로 캐스팅
		
		System.out.println("i2 : "+i2);
		System.out.println("b2 : "+b2);
	}

}











