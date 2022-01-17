package test.day1231;

import java.util.Scanner;

public class CalculatorEx {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//2. 첫번째 숫자를 입력 > 엔터 > 저장
		System.out.print("첫번째 정수를 입력하세요. > ");
		int first = s.nextInt();
		//3. 두번째 숫자를 입력 > 엔터 > 저장 
		System.out.print("두번째 정수를 입력하세요. > ");
		int second = s.nextInt();
		//4. 첫번째 숫자 + 두번째 숫자 결과 저장 
		int result = first + second;
		//5. 결과 출력
		System.out.printf("%d + %d = %d\n",first, second, result);
		
		int result2 = first - second;
		System.out.printf("%d - %d = %d\n",first, second, result2);
		
		result = first * second;
		System.out.printf("%d * %d = %d\n",first, second, result);
		result = first / second;
		System.out.printf("%d / %d = %d\n",first, second, result);
		
		s.close();
		
	}

}
