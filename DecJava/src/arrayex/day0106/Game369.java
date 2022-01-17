package arrayex.day0106;
//1부터 100까지 1씩 증가하면서 숫자에 3,6,9가 들어갈 때마다
//숫자와 함께 "짝!"을 출력하는 프로그램을 작성하세요
public class Game369 {
	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++) {
			if(i <= 9) {
				if(i % 3 == 0) {
					System.out.println(i+"짝!!");
				}else {
					System.out.println(i); 
				}
			}else {
				int first = i / 10; // 십의 자리
				int second = i % 10;//일의 자리
				
				if(first % 3 == 0) {
					System.out.println(i+"짝!!");
				}else if(second % 3 == 0 && second != 0) {
					System.out.println(i+"짝!!");
				}else {
					System.out.println(i); 
				}
			}//if end
		}//for end
	}
}










