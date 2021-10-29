package Ex3;

public class Java526 {

	public static void main(String[] args) {
		float e = 0;
		for(int i = 1; i <= 10000; i++) {
			long d = 1;
			for(int j = 1; j <= i; j++) {
				d *= j;
			}
			e += 1 / d;
		}
		System.out.println("10000: " + e);
		e = 0;
		for(int i = 1; i <= 20000; i++) {
			long d = 1;
			for(int j = 1; j <= i; j++) {
				d *= j;
			}
			e += 1 / d;
		}
		System.out.println("20000: " + e);
		e = 0;
		for(int i = 1; i <= 100000; i++) {
			long d = 1;
			for(int j = 1; j <= i; j++) {
				d *= j;
			}
			e += 1 / d;
		}
		System.out.println("100000: " + e);
	}
}
