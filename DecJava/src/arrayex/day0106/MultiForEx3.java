package arrayex.day0106;

public class MultiForEx3 {
//구구단 - 1단~9단까지 전부 출력
	public static void main(String[] args) {
		for(int i = 1; i <= 9 ; i++) {
			for(int j = 1; j <=9 ; j++) {
				System.out.printf("%d * %d = %d\t",i, j,  j*i);
			}
			System.out.println();
		}
	}
}
