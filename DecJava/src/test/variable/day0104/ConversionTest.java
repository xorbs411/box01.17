package test.variable.day0104;

public class ConversionTest {

	public static void main(String[] args) {
		int num1 = 2100000000;
		int num2 = 2100000000;
		
		
		int result = num1 + num2;
		//오버플로우된 음수 값이 저장됨
		System.out.println(result);
		
		long result2 = (long)num1 + num2;
		System.out.println(result2);
		
	}
} 
