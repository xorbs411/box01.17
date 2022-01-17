package modifier.day0112;

abstract class Unit {
	protected String name;
	protected int energe;

	abstract public void decEnerge();

	public int getEnerge() {
		return energe;
	}
}

class Protoss extends Unit {
	boolean fly;

	public Protoss(String n, boolean b) {
		name = n;
		energe = 100;
		fly = b;
	}

	public void decEnerge() {
		energe--;
	}
}

class Terran extends Unit {
	boolean fly;

	public Terran(String n, boolean b) {
		name = n;
		energe = 100;
		fly = b;
	}
	@Override

	public void decEnerge() {
		energe -= 3;
	}
}

class Zerg extends Unit {
	boolean fly;

	public Zerg(String n, boolean b) {
		name = n;
		energe = 100;
		fly = b;
	}

	public void decEnerge() {
		energe -= 6;
	}
}

public class UnitTest {
	public static void main(String[] args) {
		
		//
		
		Zerg z1 = new Zerg("Hydralisk", false);
		z1.decEnerge();//오버라이딩 된 메서드 실행
		System.out.println("z1 Energe : " + z1.getEnerge());
		Protoss p1 = new Protoss("Corsair", true);
		p1.decEnerge();
		System.out.println("p1 Energe : " + p1.getEnerge());
		Terran t1 = new Terran("Marine", false);
		t1.decEnerge();
		System.out.println("t1 Energe : " + t1.getEnerge());
	}
}