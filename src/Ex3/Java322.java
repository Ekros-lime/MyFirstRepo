package Ex3;

import java.util.Scanner;

public class Java322 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		
		if(Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2))<=10) {
			System.out.println("In the circle");
		}
		else {
			System.out.println("Not in the circle");
		}
	}

}
