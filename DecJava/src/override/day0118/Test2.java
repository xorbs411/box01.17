package override.day0118;
class Parent2 {
	   static void getTest() {
	      System.out.println("parent");
	   }
	}
	class Child2 extends Parent2 {
	   static void getTest() {
	      System.out.println("child");
	   }
	}
	public class Test2 {
	   public static void main(String[] args) {
	      Parent2 parent1 = new Parent2();
	      Child2 child = new Child2();

	      parent1.getTest();
	      child.getTest();
	   }

	}