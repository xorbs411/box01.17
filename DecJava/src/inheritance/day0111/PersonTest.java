package inheritance.day0111;

public class PersonTest {

	public static void main(String[] args) {
		Name n = new Name("kim","Java");
		Address a = new Address("12345","서울시 종로구", "솔데스크 504호");
		
		Person p = new Person(n, 20, a);
		
		System.out.println(p.names.name);
		System.out.println(p);
		

	}

}
