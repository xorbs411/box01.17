package stringex.day0121;

public class StringEx2 {
	public static void main(String[] args) {
		String filename = "hello.java";
		int index = filename.indexOf(".");
		String name = filename.substring(0, index);
		String ext = filename.substring(index+1);

		System.out.println(
				filename+"의 파일명은 "+name+"이고 확장자는 "+ext+"입니다.");
		
		String abc = "abc";
		System.out.println(abc.indexOf("Z"));//-1 
		if(abc.indexOf("z")==-1) {
			System.out.println(abc+"에 해당 글자(Z)없음.");
		}
			
	}

} 
