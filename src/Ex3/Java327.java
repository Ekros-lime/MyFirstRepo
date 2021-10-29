package Ex3;

import java.util.Scanner;

public class Java327 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float x = input.nextFloat();
		float y = input.nextFloat();
		
		float c = -x / 2;
		
		if(x >= 0 && y >= 0 && y <= (c + 100)) {
			System.out.println("In");
		}
		else {
			System.out.println("Not in");
		}
	}

}
