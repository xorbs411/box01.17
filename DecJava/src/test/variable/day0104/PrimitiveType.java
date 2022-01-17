package test.variable.day0104;

public class PrimitiveType {
	public static void main(String[] args) {
		//변수 선언
		boolean b = true;
		System.out.println("b : "+b);
		b = false;
		System.out.println("b : "+b);
		
		char c1 = 'A';
		char c2 = 65;//숫자 저장시 숫자에 맞는 글자로 바꿔서 저장
		char c3 = (char)0xfAC00; //44032
		
		System.out.println("c1 :"+c1); //A
		System.out.println("c2 :"+c2); //A - 아스키코드
		System.out.println("c3 :"+c3);//가 - UTF-8
		/* 여러줄 주석 */
		
		int i = 100;
		//int 범위를 넘어서는 정수 리터럴값 -> error
		//뒤에 접미사 L/l을 붙여서 long타입을 명시해준다.
		long l = 100000000000L;
		
		float f = 100;
		double d = 100;
		System.out.println("f :"+f);
		System.out.println("d :"+d);
			
		
		double d2 = 3.14;
		//실수 리터럴 -> double , float에 저장X
		//실수 리터럴에 접미사 F/f을 붙이면 float타입 명시
		float f2 = 3.14F;
		
		float f3 = 1.00000000001F;
		double d3 = 1.00000000001;
		System.out.println("f3 : "+f3);
		System.out.println("d3 : "+d3);
	}
}




