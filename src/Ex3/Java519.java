package Ex3;

public class Java519 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 8; i++) {
			for(int j = 1; j <= 15; j++) {
				if(j <= 8-i || j >= 8 + i) {
					System.out.print("  ");
				}
				else {
					if(j <= 8) {
						System.out.print((int)Math.pow(2, j - 1) + " ");
					}
					else {
						System.out.print((int)Math.pow(2, 15 - j) + " ");
					}
				}
			}
			System.out.println("");
		}
	}

}