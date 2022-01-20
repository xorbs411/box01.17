package interfaceex.day0119;

public class WeekTest {

	public static void main(String[] args) {
		Week today = Week.SAT;
		System.out.println(today);
		System.out.println(today.name());//객체의 문자열 리턴
		System.out.println(today.ordinal());//순번
		System.out.println(today.compareTo(Week.FRI));// 순번차이
		for (Week day: Week.values()) {//배열로 모든 값 가져오기
			System.out.println(day.name());
		}
		
		if(today.compareTo(Week.FRI) <=0) {
			System.out.println("공부하자~");
		}else {
			System.out.println("놀자~~");
		}
	}

}
