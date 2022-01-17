package arrayex.day0106;
// A반 학생의 성적은 79,88,91,33,100,55,95 이다.
// 배열에 저장 후 최고점, 최저점을 출력하세요.
public class ArrayEx4 {
	public static void main(String[] args) {
		int[] aScore = {79,88,91,33,100,55,95};
		
		int max = 79;
		int min = 79;
		
		for(int i = 1; i < aScore.length; i++ ) {
			int value = aScore[i];
			if(max < value) {
				max = value;
			}
			if(min > value) {
				min = value;
			}
		}//for
		
		System.out.println("최고점 : "+max);
		System.out.println("최저점 : "+min); 
	}

}





