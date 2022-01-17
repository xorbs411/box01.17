package modifier.day0112;

public class TimeTest {
	public static void main(String[] args) {
		Time t = new Time(12, 35, 30);
		System.out.println(t);// 참조변수 추력 - tostring()
		//t.hour = 100;
		t.setHour(t.getHour() + 1); // 현재시간보다 1시간 후로 변경한다.
		System.out.println(t);
	}
}

class Time {
	private int hour;
	private int minute;
	private int second;

	Time(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
//getter : 변수에 저장된 값을 리턴하는 메서드
	public int getHour() {
		return hour;
	}
//setter : 변수에 전달받은 값을 저장하는 메서드
	public void setHour(int hour) {
		if (hour < 0 || hour > 23) {
			return;}
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (minute < 0 || minute > 59)
			return;
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (second < 0 || second > 59)
			return;
		this.second = second;
	}

	@Override
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}
}
