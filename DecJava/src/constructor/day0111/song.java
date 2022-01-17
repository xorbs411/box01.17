package constructor.day0111;

public class song {
	String title;
	String artist;
	int  year;
	String country;
	
	song(){}
	
	
	

	song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	void show() {
		System.out.printf("%s, %d년 %s {%s}\n",
				country, year, artist, title);
	}
	




	public static void main(String[] args) {
		song s1 = new song("Dancing Queen","ABBA",1978,"스웨덴");
		
		s1.show();
		
		

	}

}
