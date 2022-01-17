package test.variable.day0104;

public class OperEx8 {
	public static void main(String[] args) {
		
		int score = 80;
		
		char grade = 
				score >= 90 ? 'A': (score >= 80?'B' :'C');
		
		System.out.println("학점 : "+grade);
		
	}

}
