package ifex.day0105;

import java.util.Scanner;
/** api문서 주석*/
public class ConditionOperEx {
//스캐너 생성 후 
//입력한 값을 저장, 저장된 값이 짝수라면 "짝수입니다."출력
//저장된 값이 홀수라면 "홀수입니다."출력
//스캐너 종료	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력하세요. > ");
		int num = s.nextInt();
		String str="";
		
		str = num % 2 == 0 ? "짝수입니다." :"홀수입니다." ;
		System.out.printf("%d는 %s",num, str);
		s.close();
	}
}
