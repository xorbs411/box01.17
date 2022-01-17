package initvariable;
//파일 저장시 이름이 없으면 제목없음n
//있으면 지정한 이름.
class Document {
	static int count = 0;
	String name;		// 문서명(Document name)

	public Document() {     // 문서 생성 시 문서명을 지정하지 않았을 때
		this("제목없음" + ++count);
	}

	public Document(String name) {
		this.name = name;
		System.out.println("문서 " + this.name + "가 생성되었습니다.");
	}
}

class DocumentTest {
	public static void main(String args[]) {
		Document d1 = new Document();
		Document d2 = new Document("자바.txt");
		Document d3 = new Document();
		Document d4 = new Document();
	}
}





