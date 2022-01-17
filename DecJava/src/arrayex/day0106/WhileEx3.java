package arrayex.day0106;

import java.util.Scanner;
// 1.예금 | 2.출금 | 3.조회 | 4.종료
// 마통 금지!!
public class WhileEx3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int balance = 0;//계좌 잔액
		boolean flag = true; // true : 실행, false : 중지
		
		while(flag) {
			System.out.println("==============================");
			System.out.println("1.예금 | 2.출금 | 3.조회 | 4.종료");
			System.out.println("==============================");
			System.out.print("선택 > ");
			
			int menu = s.nextInt();
			
			if(menu == 1) {
				System.out.print("예금액 > ");
				int money = s.nextInt();
				balance += money;
				System.out.println(money+"원이 입금되었습니다.");
			}else if(menu == 2) {
				System.out.print("출금액 > ");
				int money = s.nextInt();
				if((balance - money) >= 0) {
					balance -= money;
					System.out.println(money+"원이 출금되었습니다.");
				}else {
					System.out.println("잔액이 부족합니다.");
				}
			}else if(menu == 3) {
				System.out.println("잔액 > "+balance);
			}else {
				System.out.println("프로그램 종료");
				flag = false;
			}
		}//while
		s.close();
	}

}
