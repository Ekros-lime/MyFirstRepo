package Ex5;

public class Java93 {

	public static void main(String[] args) {
		Date time = new Date();
		int t = 10000;
		time.setTime(t);
		System.out.println(time.ToString());
		for(int i = 0; i < 7; i++) {
			t *= 10;
			time.setTime(t);
			System.out.println(time.ToString());
		}
	}

}

class Date {
	int time;
	int hour;
	int min;
	int sec;
	Date(){
		time = 0;
		hour = 0;
		min = 0;
		sec = 0;
	}
	Date(int newTime){
		time = newTime;
		hour = time / 3600;
		time %= 3600;
		min = time / 60;
		time %= 60;
		sec = time;
	}
	void setTime(int newTime) {
		time = newTime;
		hour = time / 3600;
		time %= 3600;
		min = time / 60;
		time %= 60;
		sec = time;
	}
	String ToString() {
		String str = "";
		str += this.hour;
		str += "hour;";
		str += this.min;
		str += "min;";
		str += sec;
		str += "sec";
		return str;
	}
}
