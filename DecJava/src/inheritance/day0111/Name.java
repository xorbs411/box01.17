package inheritance.day0111;

public class Name {
	String Family;
	String name;
	
	Name(){}
	
	

	Name(String family, String name) {
		Family = family;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Name [Family=" + Family + ", name=" + name + "]";
	}



	public static void main(String[] args) {
		

	}

}
