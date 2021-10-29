package Ex3;

public class Java57 {

	public static void main(String[] args) {
		float d = 10000;
		float sum = 0;
		for(int i = 0; i < 10; i++) {
			if(i <= 3) {
				sum += d;
			}
			d *= 1.05;
		}
		System.out.println("4 years is " + sum + ", 10 years later is " + d);
	}

}
