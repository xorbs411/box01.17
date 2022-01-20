package come.mytest;

abstract class Person {
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	abstract void  print();
}
 
 
abstract class Student extends Person {
	int id;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
abstract void print();
}

abstract class Teacher extends Person{
	String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
abstract void print();
}

abstract class Employee extends Person{
	String dept;

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	abstract void print();	
	
}

class School {
	public static void main(String args[]) {
		
	}

	@Override
	public String toString() {
		return "School [toString()=" + super.toString() + "]";
	}
}












