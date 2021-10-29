package Ex3;

import java.util.Scanner;

public class Java329 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float x1 = input.nextFloat();
		float y1 = input.nextFloat();
		float r1 = input.nextFloat();
		
		float x2 = input.nextFloat();
		float y2 = input.nextFloat();
		float r2 = input.nextFloat();
		
		if(Math.abs(r1-r2) >= Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1 - y2, 2))) {
			System.out.println("Inside");
		}
		else if(r1+r2 >= Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1 - y2, 2))) {
			System.out.println("Overlap");
		}
		else {
			System.out.println("Not");
		}
		
	}

}