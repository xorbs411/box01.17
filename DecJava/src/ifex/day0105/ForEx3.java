package ifex.day0105;

import java.util.Scanner;

public class ForEx3 {
//1 ~ 입력한 값까지의 합을 구하세요.
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("정수를 입력하세요 > ");
		int num = s.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= num ; i++) {
			sum += i;
		}
		
		System.out.println("1부터 "+ num+"까지의 합 : "+sum);
		
		s.close();
	}

}
