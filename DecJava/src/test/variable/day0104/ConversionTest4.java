package test.variable.day0104;

public class ConversionTest4 {
//크기가 다른 타입의 계산은 큰 타입의 데이터로 바꿔서 계산
//계산할때 변수에 저장된 값만 꺼내와서 저장
//실수의 소수점을 버림할 경우 (int)로 형변환한다. 	
	public static void main(String[] args) {
		int i = 100;
		double d = 100;
		
		double result = i + d;
		int iResult = i + (int)d;
		
		System.out.println("i : "+i);
		System.out.println("d : "+d);
		System.out.println("result : "+result);
		System.out.println("iResult : "+iResult);
		
	}

}
