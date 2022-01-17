package methodex.day0110;

public class Square {
	//getArea : 정사각형의 넓이를 구해 리턴한다.
	int getArea(int a) {
		return a * a;
	}
	
	//getArea : 직사각형의 넓이를 구해 리턴한다.
	int getArea(int a, int b) {
		return a * b ;
	}
	//getArea : 사다리꼴의 넓이를 구해 리턴한다.
	double getArea(int a, int b, int h) {
		return (a + b)* h /2.0;
	}
	
	

	public static void main(String[] args) {
		Square s = new Square();
		
		System.out.println("정사각형:"+s.getArea(5));
		System.out.println("직사각형:"+s.getArea(5,3));
		System.out.println("사다리꼴:"+s.getArea(3,5,6));
				
	

	}

}
