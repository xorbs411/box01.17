package initvariable;

public class BlockTest {
	
	static {System.out.println("static{}");}
	{System.out.println("{}");}
	BlockTest(){
		System.out.println("생성자");
	}

	public static void main(String[] args) {
		BlockTest bt =new BlockTest();
		BlockTest bt1 =new BlockTest();
		
	}

}
