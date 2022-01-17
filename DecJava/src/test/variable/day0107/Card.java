package test.variable.day0107;
//22.01.11 
//생성자 constructure
public class Card {
	
	String kind;
	int number;
	
	
	
	Card(){}//매개변수가 없는 생성자- 기본생성자 (생성자도 오버로딩 가능)
	Card(String k){
		kind = k;
	}
	Card(String k, int n){
		kind = k;// 인스턴스 변수 초기화
		number = n;
	}
	

}
