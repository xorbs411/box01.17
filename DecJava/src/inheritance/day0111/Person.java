package inheritance.day0111;
//이름, 나이, 주소
//이름(Name)은 성(family)과 이름(name)으로 이루어져있다.
//주소(Adrdress)는 우편번호(postcode), 행정구역1(area1), 행정구역2(area2) 으로 이루어져있다.
public class Person {
	
	Name names;
	int age;
	Address addr;
	
	Person(){}
	
	
	Person(Name names, int age, Address addr) {
		this.names = names;
		this.age = age;
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return "Person [names=" + names + ", age=" + age + ", addr=" + addr + "]";
	}


	public static void main(String[] args) {
		
	}

}
