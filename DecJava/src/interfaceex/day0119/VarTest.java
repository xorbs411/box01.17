package interfaceex.day0119;

public class VarTest {
	
	public void argTest(int a ,String...n) {
		for(int i=0; i <n.length; i++) {
			System.out.println(n[i]);
		}
	}

	public static void main(String[] args) {
		VarTest vt =new VarTest();
		vt.argTest(1, "a","b","c");
		vt.argTest(2, "1","2","3","4","5");

	}

}
