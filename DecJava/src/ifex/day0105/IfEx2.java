package ifex.day0105;

import java.util.Scanner;

public class IfEx2 {
//	//나이를 저장하고 20살 이상이면 "성인"
//	   17살 이상이면 "고등학생"
//	   14살 이상이면 "중학생"
//	   8살 이상이면 "초등학생"
//	   그 외 나이라면 "아동" 을 출력하세요.
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("나이를 입력하세요 > ");
		int age = s.nextInt();
		String student = "";

		if (age >= 0 && age < 130) {
			if (age >= 20) {
				student = "성인";
			} else if (age >= 17) {
				student = "고등학생";
			} else if (age >= 14) {
				student = "중학생";
			} else if (age >= 8) {
				student = "초등학생";
			} else {
				student = "아동";
			}
			System.out.println(student + "입니다.");
		}else {
			System.out.println("나이를 잘못 입력했습니다.");
		}
		

		s.close();
	}

}
