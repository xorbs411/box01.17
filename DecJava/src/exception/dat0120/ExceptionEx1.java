package exception.dat0120;

public class ExceptionEx1 {

	public static void main(String[] args) {
		int[] var = { 10, 200, 30 };

		for (int i = 0; i <= 3; i++) {
			try {
				System.out.println("***"+(i+1));
				System.out.println(var[i]);
				System.out.println("~~~"+(i+1));//예외 발생하는 순간 포기
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("예외 발생");
				System.err.println(e.getMessage());
				e.printStackTrace();// 예외 추적 메서드
			}
		}
		System.out.println("program end!!");

	}

}
