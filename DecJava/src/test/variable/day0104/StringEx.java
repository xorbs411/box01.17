package test.variable.day0104;

public class StringEx {

	public static void main(String[] args) {
		//String : 문자열 표현을 목적으로 만든 클래스 
		String str = "문자열";
		String empty = "";//빈 문자열
		String blank = " ";//공백도 문자열이다.
		
		// + : 숫자 + 숫자 -> 더하기(연산)
		//   : 문자열 + 문자열 -> 이어쓰기 "a" + "b" -> "ab"
		//	 : 문자열 + 숫자 : String이 우선권을 가진다. 
						 //	숫자 -> String 변환
		
		String s1 = 7 +" ";
		String s2 = " "+7;
		String s3 = 7+"";//int -> String 
		String s4 = ""+7;
		String s5 = ""+7+7; // "77"
		String s6  = 7+7+"";// "14"
		
		//String s = (String)10; error-기본형과 참조형간의 형변환X
				
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
				
	}

}






