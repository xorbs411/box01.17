package initvariable;

public class InitTest {

	static int cv = 1;
	int iv = 1;

	static {
		cv = 2;
		System.out.println("static{}");
	}

	{
		iv = 2;
		System.out.println("{}");
	}

	InitTest() {
		iv = 3;
		System.out.println();
	}

	public static void main(String[] args) {

		InitTest i = new InitTest();
		System.out.println(InitTest.cv);
		System.out.println(i.iv);
	}
}
