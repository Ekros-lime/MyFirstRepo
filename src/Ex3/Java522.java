package Ex3;

public class Java522 {

	public static void main(String[] args) {
		float sum = 0;
		for(int i = 3; i <= 99; i += 2) {
			sum += (i - 2)/i;
		}
		System.out.println(sum);
	}

}
