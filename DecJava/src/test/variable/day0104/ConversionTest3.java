package test.variable.day0104;

public class ConversionTest3 {
//4byte 미만의 계산은 int로 바꿔서 계산
	public static void main(String[] args) {
		short s1 = 10;
		short s2 = 20;

		short s3 = (short)(s1 + s2);
		int result  = s1 + s2; 
		System.out.println("result : "+s3);
		System.out.println("result : "+result);	
	}

}

