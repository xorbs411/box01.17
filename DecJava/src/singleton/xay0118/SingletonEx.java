package singleton.xay0118;

class Singleton{
	
	private static Singleton s =new Singleton();
	
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		return s;
		
	}
	
	//멤버 선언
	int x;
}

public class SingletonEx {

	public static void main(String[] args) {
		//Singleton s = new Singleton();
		Singleton s = Singleton.getInstance();
		s.x =10;
		Singleton s2 = Singleton.getInstance();
		System.out.println(s2.x);//10
		
		System.out.println(s==s2); //true

	}

}
