package test.variable.day0104;

public class OperEx1 {

	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 3;
		
		System.out.println(n1 + n2); //13
		System.out.println(n1 - n2); // 7
		System.out.println(n1 * n2); //30
 		System.out.println((double)n1 / n2); //
		System.out.println(n1 % n2);
		
		System.out.println(n1/0.0);//Infinity
		System.out.println(n1%0.0);//NaN(Not a Number)
		
		//어떤 숫자라도 0으로 나눌 수 없다.
		//int n3 = 0;
		//System.out.println(n1/n3);
		//ystem.out.println(n1%n3);
		
		String s = "";
		String s1 = n1 + s;
		//String s2 = n1 % s;
		// - * / % => 숫자 데이터만 다룰 수 있다.
	}
}








