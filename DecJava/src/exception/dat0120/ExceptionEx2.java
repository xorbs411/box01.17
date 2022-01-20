package exception.dat0120;

public class ExceptionEx2 {

	public static void main(String[] args) {
		// Integer.parseInt : 숫자로만 이루어진 문자열을 int로 바꾼다.
		try {
			int data = Integer.parseInt(args[0]);
			int result = 50 / data;

			System.out.println(result);
			
		} catch (ArrayIndexOutOfBoundsException aie) {
			System.out.println("값을 입력해주세요");
		} catch (NumberFormatException | ArithmeticException ari) {
			System.out.println("0이 아닌숫자만 입력할 수 있습니다.");
		

		}
		System.out.println("프로그램 종료");
	}

}
//ArrayIndexOutOfBoundsException
//NumberFormatException
//ArithmeticException