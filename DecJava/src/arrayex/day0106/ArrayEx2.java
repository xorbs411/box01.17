package arrayex.day0106;

public class ArrayEx2 {
	public static void main(String[] args) {
		
		int[] arr = { 10, 20, 30, 40, 50 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
//향상된 for문 : foreach문 
//집합데이터에 있는 모든 데이터를 처음부터 끝까지 하나씩 꺼내오는 반복문
//for(타입 변수 : 집합데이터	){변수 사용;}	
		for(int i : arr) {
			System.out.println(i);
		}
		
		char[] cArr = {'T','E','S','T'};
		for(char c : cArr ) {
			System.out.print(c);
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println(arr); //int[] - 주소값(hashcode) 출력
		System.out.println(cArr);
		//char[] : 다 합쳐서 하나의 문자열로 출력
		
			
	}
}





