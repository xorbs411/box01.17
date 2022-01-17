package arrayex.day0106;

import java.util.Scanner;
//1,2,3을 입력시 입력값을 출력 후 반복, 
//그외 나머지 값인 경우 반복 종료
public class WhileEx2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		boolean stop = false;//false : 실행 , true : 중지
		
		while(!stop) {
			System.out.print("번호를 입력하세요(1,2,3) : ");
			int num = s.nextInt();
			
			if(num == 1) {
				System.out.println("1을 입력했습니다.");
			}else if(num == 2) {
				System.out.println("2을 입력했습니다.");
			}else if(num == 3) {
				System.out.println("3을 입력했습니다.");
			}else {
				System.out.println("잘못된 번호를 입력했습니다.");
				stop = true;
			}//if
		}//while
		System.out.println("program end!!");
		s.close();
	}//main
}
