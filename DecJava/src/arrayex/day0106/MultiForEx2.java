package arrayex.day0106;

public class MultiForEx2 {
	public static void main(String[] args) {
		for(int i = 0; i < 5 ; i++) {// 0,1,2,3,4
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
