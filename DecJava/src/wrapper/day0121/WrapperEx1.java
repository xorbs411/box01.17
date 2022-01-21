package wrapper.day0121;

public class WrapperEx1 {
	public static void main(String[] args) {

		Integer i = new Integer(100);
		Integer i2 = new Integer("100");
		
		System.out.println("i == i2 : "+ (i == i2));
		System.out.println("i.equals(i2) : "+i.equals(i2));
		
		System.out.println(i);
		System.out.println("i.compareTo(i2) : "+i.compareTo(i));
		
		System.out.println("MAX_VALUE:"+Integer.MAX_VALUE);
		System.out.println("MIN_VALUE:"+Integer.MIN_VALUE);
		System.out.println("SIZE:"+Integer.SIZE);
		System.out.println("BYTES:"+Integer.BYTES);
		System.out.println("TYPE:"+Integer.TYPE);
		
	}
}
