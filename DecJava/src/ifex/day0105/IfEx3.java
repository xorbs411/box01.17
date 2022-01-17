package ifex.day0105;

import java.util.Scanner;

public class IfEx3 {
	//두개의 정수를 입력받아 두 숫자의 차를 구하시오
	//단 음수가 나오면 안됩니다.
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요 > ");
		int first = s.nextInt();
		System.out.print("두번째 숫자를 입력하세요 > ");
		int second = s.nextInt();
		
		if(first > second) {
			System.out.println(first - second);
		}else {
			System.out.println(second - first);
		}
		
		s.close();
	}

}
