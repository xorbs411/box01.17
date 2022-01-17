package arrayex.day0106;

public class ObjArrayEx3 {

	public static void main(String[] args) {

		if (args.length > 0) {
			for (String s : args) {
				System.out.println(s);
			}
		}else {
			System.out.println("입력한 값이 없습니다.");
		}

	}
}
