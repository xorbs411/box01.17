package methodex.day0110;
//4-1. Student 클래스를 정의한다
	//변수 - 학생 이름(name), 반(ban), 번호(no), 국어점수(kor), 영어점수(eng), 수학점수(math)
	//메서드
	//국어점수(kor), 영어점수(eng), 수학점수(math)의 총합을 리턴하는 메서드 getTotal()
	//국어점수(
public class Student {
	
	String name;
	int ban;
	int no;
	int kor; 
	int eng;
	int math;
	
	int getTotal(){
		return kor + eng+ math;
		
	}
	int getAverage(){
		return (kor +eng +math)/3;
	}
	
	public static void main(String[] args) {
		

	}

}
