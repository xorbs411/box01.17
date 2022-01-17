package constructor.day0111;

class Data1{
	int x;
}
class Data2{
	int x;//인스턴스 변수
	Data2(){}
	Data2(int i){ //생성자
		x= i;
		
	}
}



public class ConstructorEx {

	public static void main(String[] args) {
		Data1 d1 =new Data1();
		Data2 d2 =new Data2();//error
		Data2 d3 =new Data2(10);

	}
	ConstructorEx(){}//생성자 추가
}
