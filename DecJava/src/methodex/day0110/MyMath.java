package methodex.day0110;

public class MyMath {
	// 사칙 연산
	// add : int값 두개 입력받아 더한 결과 리턴
	int add(int n1, int n2) {
		return n1+n2;
	}
	
	// substract : int값 두개 입력받아 뺀 결과 리턴
	int substract(int i, int j){
		return i-j;
	}
	
	// mutltiply : int값 두개 입력받아 곱한 결과 리턴
	int mutltiply (int i, int j) {
		return i*j;
	}
	
	// divide : dounle값 두개 입력받아 나눈 결과 리턴
	// boolean을 제외한 기본형이면서 작은 타입 ----->큰타입인경우
	//자동으로 형변환 후 저장
	
	double divide (int a, int b) {
		return a/b;
	}
	
	
	
	public static void main(String[] args) {
		
		MyMath mm = new MyMath();
		int add= mm.add(1, 2);
		System.out.println(add);
		System.out.println(mm.mutltiply(10, 20));
		System.out.printf("%.2f",mm.divide(10, 3));
		
		
		
		
		

	}

}
