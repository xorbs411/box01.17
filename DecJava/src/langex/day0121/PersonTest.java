package langex.day0121;

class Person{
	long personId;

	public Person(long personId) {
		this.personId = personId;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			return personId == ((Person)obj).personId;
		}
		return false; //Person이 아닌 다른 타입의 객체라면 다른거!!
	}
	
	
	
	
	
}

public class PersonTest {

	public static void main(String[] args) {
		Person p1 =new Person(2201013123456L);
		Person p2 =new Person(2201013123456L);
		
		if(p1 == p2) {
			System.out.println("p1과 p2는 같은 사람입니다.");
			
		}else {
			System.out.println("p1과 p2는 다른 사람입니다.");
		}
		
		if(p1.equals(p2)) {
			System.out.println("p1과 p2는 같은 사람입니다.");
			
		}else {
			System.out.println("p1과 p2는 다른 사람입니다.");
		}
		

	}

}
