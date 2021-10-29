package Ex3;

import java.util.Scanner;

public class Java521 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Ehter num: ");
		float d = input.nextFloat();
		System.out.print("Ehter year: ");
		int year = input.nextInt();
		
		for(double i = 0.05; i <= 0.08; i += 0.00125) {
			float sum = 0;
			float dd = d;
			for(int j = 0; j < year; j++) {
				sum += dd;
				dd *= (1 + i);
			}
			System.out.println(sum);
		}
	}

}
