package Ex3;

import java.util.Scanner;

public class Java323 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		
		if(x<=5&&x>=-5&&y<=2.5&&y>=-2.5) {
			System.out.println("In");
		}
		else {
			System.out.println("Not in");
		}

	}
}