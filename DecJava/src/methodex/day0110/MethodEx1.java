package methodex.day0110;

public class MethodEx1 {
	//1.add -int값 두개 입력받아 더하고 더한 결과를 돌려준다
	int max (int a, int b) {
		int result = 0;
		if (a>b) {
			result =a;
		}else {
			result = b;
		}
		return result;
	}
	//2. print string 값 1개 입력 받아 해당 문자열 출력하는
	//리턴값이 없는 메서드
	void print (String str){
		System.out.println(str);
	}
	
	//3. int 배열을 입력 받아 그안에 있는 모든 숫자를 더하고 그 값을 
	//리턴하는 메서드
	int intArr (int[] arr){
		int sum = 0;
		for(int i : arr) {
			sum +=i;
		}
		return sum;
	}
	//4. random_10 랜덤값(1~10)사이의 값을 리턴
    int random_10() {
    	return (int)(Math.random()*10)+1;
    }
	
	// 메서드가 정상적으로 종료되는 경우- 메서드의 블럭{}끝에 도달햇을떄
	// 메서드 블럭{} 수행도중 return문을 만났을떄===>(void,return;)
	// 반환값이 있는경우 return문뒤에 반환값 지정---->  return 반환값;
	
		
	
public static void main(String[] args) {
	 
	MethodEx1 m1 = new MethodEx1();
	int max = m1. max(10,5);
	System.out.println("10과 5중 더 큰 숫자는 "+max+"입니다.");
	
	m1.print("test");
	int sum = m1.intArr(new int[] {1,2,3,4});
	System.out.println(sum);
	
			
			
	
	
}
		}
		



