package arrayex.day0106;

public class MultiForEx {
//1~4까지를 3번 출력!
	public static void main(String[] args) {
		for(int i = 0; i < 3; i++) {
			for(int j = 1; j <= 4; j++) {
				System.out.print(j+"  ");
			}//inner
			System.out.println();
		}//outter for
		System.out.println("끝!!");
	}//main - 프로그램 종료

}//class
