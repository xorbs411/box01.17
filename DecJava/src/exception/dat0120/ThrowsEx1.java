package exception.dat0120;

public class ThrowsEx1 {
	
	public void cutString(String str) throws ArrayIndexOutOfBoundsException{
		String s = str.substring(0, 1);
		printGugudan(s);
		
		
	}
	
	public void printGugudan(String s) throws ArrayIndexOutOfBoundsException {
		int dan = Integer.parseInt(s);
		for(int i =0; i<10; i++) {
			System.out.printf("%d*%d =%d\n", dan,i,(dan*1));
		}
		
	}
	
	
	public static void main(String[] args) {
		ThrowsEx1 t1 =new ThrowsEx1();
		t1.cutString(args[0]);
		
		

	}

}
