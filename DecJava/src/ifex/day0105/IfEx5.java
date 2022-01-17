package ifex.day0105;

import java.util.Scanner;

public class IfEx5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("과세 표준금액을 입력하세요");
		System.out.print("과세 표준금액 > ");
		int money = s.nextInt();
		int tax = 0;
		
		if(money <= 1000)
			tax = (int)(money * 0.08);
		else if(money <= 4000) {
			tax = (int)(money * 0.17);
		}else if(money <= 8000) {
			tax = (int)(money * 0.26);
		}else {
			tax = (int)(money * 0.35);
		}
		
		System.out.printf("근로 소득세 : %d만원", tax);
		
		s.close();
	}
	
}








