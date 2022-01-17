package ifex.day0105;

public class ForEx7 {
//1부터 100까지의 자연수 중에서 
//3의 배수이면서 동시에 5의 배수인 숫자를 출력하세요.
	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0 & i % 5 == 0) {
				System.out.println(i);
			}
		}
		

	}

}
