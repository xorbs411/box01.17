package methodex.day0110;

import java.util.Scanner;

//WhileEx3 --> oop에 맞게 바꿔보자
//클래스 Account
//변수 balace int 잔액(잔액은 음수가 될수 없고 백만원을 넘을 수 없다.)
//메서드 :
//deposit : int 예금
//withdraw : int 출금
//getBalace : 잔액 조회

public class Account {
	int balance;
	
	void deposit(int money){
		if(balance+money > 1000000) {
			System.out.println("최대 백만원까지만 예금할 수 있습니다.");
			
		}else {
			balance +=money;
			System.out.println(money+"원이 입금되었습니다.");
		}
	}
	
	void withdraw(int money){
		if(balance - money <0) {
			System.out.println("잔액이 부족합니다.");
		}else {
				balance -= money;
				System.out.println(money+"원이 출금되었습니다.");
			}
		}
	
	
	

	
	
	

	
	
	

	public static void main(String[] args) {
		
		Account account = new Account();
		Scanner s = new Scanner(System.in);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		s.close();
		
		
		
		
		

	}

}
