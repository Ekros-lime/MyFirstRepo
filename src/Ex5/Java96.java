package Ex5;

public class Java96 {

	public static void main(String[] args) {
		StopWatch k = new StopWatch();
		k.start();
		for(int i = 0; i < 10000; i++) {
			
		}
		k.stop();
		System.out.println(k.getElapsedTime());
	}
}

class StopWatch{
	private long startTime;
	private long endTime;
	
	StopWatch(){
		startTime = System.currentTimeMillis();
	}
	
	void start() {
		startTime = System.currentTimeMillis();
	}
	
	void stop() {
		endTime = System.currentTimeMillis();
	}
	
	long getElapsedTime() {
		return (endTime - startTime) * 1000;
	}
}
