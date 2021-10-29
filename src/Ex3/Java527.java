package Ex3;

public class Java527 {

	public static void main(String[] args) {
		int n = 0;
		int m = 0;
		for(int i = 101; i <= 2100; i++) {
			if((i % 4 == 0 && i % 100 != 0)||i % 400 == 0) {
				m++;
				if(n != 10) {
					System.out.print(i);
					n++;
				}
				else {
					System.out.println("");
					System.out.print(i);
					n = 0;
				}
			}
		}
		System.out.println("");
		System.out.print(m);
	}

}
