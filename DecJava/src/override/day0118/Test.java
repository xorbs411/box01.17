package override.day0118;
class Parent{
	   private void method1() {
	      System.out.println("parent method 1");
	   }
	   public void method2() {
	      method1();
	   }
	}
	class Child extends Parent{
	   public void method1() {
	      System.out.println("Child method 1");
	   }   
	}
	public class Test {
	   public static void main(String[] args) {
	      Child c = new Child();
	      c.method2();
	   }
	}
