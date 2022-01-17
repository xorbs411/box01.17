package methodex.day0110;

public class StaticInstanceEx {
	
	static int cv = 1;
	int iv = 2;
	
	static int cv2 = cv;
	//static int cv3 = iv; // error staitc은 instance 사용X
	
	int iv2 = cv;
	int iv3 = iv;
	
	

	public static void main(String[] args) {
		System.out.println(cv);
    //System.out.println(iv);  // error static은 instace를 사용할수없다
		StaticInstanceEx si = new StaticInstanceEx();
		System.out.println(si.iv);
	
		

	}

}
