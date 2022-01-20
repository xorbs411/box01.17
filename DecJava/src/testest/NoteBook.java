package testest;

public class NoteBook implements Computer {

	@Override
	public int getRentalPrice(int day) {
		int cost = 500;
		day -= 2;
		if(day > 0) {
			cost += day * 200;
		}
		return cost;
	}

}
