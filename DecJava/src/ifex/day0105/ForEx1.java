package ifex.day0105;

public class ForEx1 {

	public static void main(String[] args) {
		//10번 반복 0 ~ 9
		//for문 지역에서 선언된 변수는 지역 내에서만 사용 가능
		int i = 0;
		for(;i <= 9;) {
			System.out.println(i);
			i++;
		}
		System.out.println(i);
		System.out.println("for end!!");
		//0~3까지 출력
		for(int j = 0; j <= 3; j++) {
			System.out.println(j);
		}
		// 0~20까지 출력
		for(int j = 0; j <= 20; j++) {
			System.out.println("j:"+j);
		}
		// 1~20까지 출력
		for(int j = 1; j <= 20; j++) {
			System.out.println("jj:"+j);
		}
		//1~20사이의 홀수만 출력
		for(int j = 1; j<= 20; j++) {
			if(j % 2 != 0) {
				System.out.println("odd : "+j);
			}
		}
		for(int j = 1; j <= 20; j+=2) {
			System.out.println(j);
		}
	}

}







