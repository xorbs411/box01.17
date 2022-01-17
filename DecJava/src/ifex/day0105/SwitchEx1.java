package ifex.day0105;

public class SwitchEx1 {

	public static void main(String[] args) {
		int dice = (int)(Math.random()*6)+1;//1~6사이의 랜덤값 발생
		
		switch(dice) {
		case 1:
			System.out.println("1이 나왔습니다.");
			break;
		case 2:	
			System.out.println("2가 나왔습니다.");
			break;
		case 3:	
			System.out.println("3이 나왔습니다.");
			break;
		case 4:	
			System.out.println("4가 나왔습니다.");
			break;
		case 5:	
			System.out.println("5가 나왔습니다.");
			break;
		case 6:	
			System.out.println("6이 나왔습니다.");
			break;
		}
	
	}

}
