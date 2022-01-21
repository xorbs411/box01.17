package langex.day0121;

import java.util.Objects;

class Value{
	int x;
	int y;

	public Value(int x) {
		this.x = x;
		this.y = y;
	}

	

	



	@Override
	public String toString() {
		return "Value [x=" + x + ", y=" + y + "]";
	}







	@Override
	public boolean equals(Object obj) {
		//x,y에 저장된 값이 가으면 같은 객체
		if(obj instanceof Value) {
			Value v1 =(Value)obj;
			return x == v1.x && y == v1.y;
			
		}
		return false;
		
	}
	
	
	
}

public class EqualsEx {

	public static void main(String[] args) {
		Value v1 =new Value(10);
		Value v2 =new Value(10);
		Value v3 =new Value(10);
		// == 변수에 저장된 주소값을 비교
		System.out.println("v1 ==v2"+(v1==v2));
		// Object.equals : 객체 비교(주소)
		System.out.println("v1.equals(v2)"+v1.equals(v2));
		
		v1 = v2;
		
		System.out.println("v1 ==v2"+(v1==v2));
		System.out.println("v1.equals(v2)"+v1.equals(v2));
		
		System.out.println();
		
		System.out.println(v1);
		System.out.println(v1.hashCode());
		System.out.println(v3.hashCode());
		
		System.out.println(System.identityHashCode(v1));
		System.out.println(System.identityHashCode(v3));
				

	}

}
