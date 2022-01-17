package ifex.day0105;

import java.util.Scanner;

public class ForEx4 {
//숫자를 입력하면 그 숫자에 맞는 구구단을 출력하세요
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("단 입력 > ");
		int dan = s.nextInt();
		
		System.out.println(dan + "단");
		System.out.println("============");
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n",dan, i,  dan*i);
		}
		
		for(int i = 9; i >= 1;i--) {
			System.out.printf("%d * %d = %d\n",dan, i,  dan*i);
		}
		
		s.close();
	}
}








