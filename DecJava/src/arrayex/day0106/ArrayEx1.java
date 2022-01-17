package arrayex.day0106;

public class ArrayEx1 {
	public static void main(String[] args) {
	
		char[] ch = new char[4];
		
		ch[0] = 'J';
		ch[1] = 'a';
		ch[2] = 'v';
		ch[3] = 'a';
	//  ch[4] = '!'; // ArrayIndexOutOfBoundsException
	// 배열의 크기는 고정, 늘어나거나 줄어들지 않는다.
		for(int i = 0; i < ch.length ; i++) {
			System.out.println(ch[i]);
		}
		
		int[] iArr = {1,2,3,4};
		for(int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		
		int[] iArr2 = new int[] {5,6,7,8,9};
		for(int i = 0; i < iArr2.length; i++) {
			System.out.println(iArr2[i]);
		}
	}
}




