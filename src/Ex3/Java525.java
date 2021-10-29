package Ex3;

public class Java525 {

	public static void main(String[] args) {
		float sum = 0;
		for(int i = 1; i <= 10000; i++) {
			sum += 4 * Math.pow(-1, i+1) / (2 * i - 1);
		}
		System.out.println("10000: " + sum);
		sum = 0;
		for(int i = 1; i <= 20000; i++) {
			sum += 4 * Math.pow(-1, i+1) / (2 * i - 1);
		}
		System.out.println("20000: " + sum);
		sum = 0;
		for(int i = 1; i <= 100000; i++) {
			sum += 4 * Math.pow(-1, i+1) / (2 * i - 1);
		}
		System.out.println("100000: " + sum);
	}

}
