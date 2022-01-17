package arrayex.day0106;
//A반 학생의 성적은 95,71,84,93,87 이다.
//배열에 저장 후 점수 총합/평균을 출력하세요.(향상된 for문 사용)
public class ArrayEx3 {
	public static void main(String[] args) {
		int[] aScore = {95,71,84,93,87,90}; 

		int sum = 0;
		double avg = 0.0;
		
		for(int score: aScore) {
			sum += score;
		}
		avg = sum / (double)aScore.length;
		
		System.out.println("A반 성적 총합 : "+sum);
		System.out.printf("A반 성적 평균 : %.2f",avg);
		
	}

}
