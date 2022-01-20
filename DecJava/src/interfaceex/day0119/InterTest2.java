package interfaceex.day0119;

interface Interf1{
   int getA();
}
interface Interf2{
   int getA();
}
interface Inter3 extends Interf1, Interf2{
   //int getA(); //이름과 매개변수가 같은 추상메서드인 경우 하나로 인식
   int getDate();
}

public class InterTest2 implements Inter3{

   int a = 100;
   
   @Override
   public int getA() {
      return a;
   }

   @Override
   public int getDate() {
      return a+10;
   }
   
   public static void main(String[] args) {
	  Interf1 i1 =new InterTest2();
	  System.out.println(i1.getA());
	  Interf2 i2 = new InterTest2();
	  System.out.println(i2.getA());
	  Inter3 i3 =new InterTest2();
	  System.out.println(i3.getA());
	  System.out.println(i3.getDate());
	  

   }

   

}
