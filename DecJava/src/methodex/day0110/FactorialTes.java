package methodex.day0110;
// 재귀호출( = 반복문for보다 성능이 나쁘다)
public class FactorialTes {
	
	static long factorial(int n) {
		long result = 0;
		if(n ==1 ) {
			result = 1;
		}else {
			result =n * factorial(n-1);
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(factorial(4));

	}

}
