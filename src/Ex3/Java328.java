package Ex3;

import java.util.Scanner;

public class Java328 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float x1 = input.nextFloat();
		float y1 = input.nextFloat();
		float w1 = input.nextFloat();
		float h1 = input.nextFloat();
		
		float x2 = input.nextFloat();
		float y2 = input.nextFloat();
		float w2 = input.nextFloat();
		float h2 = input.nextFloat();
		
		if(((x2-w2)>=(x1-w1)) && ((x2+w2) <= (x1 + w1)) && ((y2-h2)>=(y1-h1)) && ((y2+h2) <= (y1 + h1))) {
			System.out.println("Inside");
		}
		else if(((x2-w2)>=(x1-w1)) || ((x2+w2) <= (x1 + w1)) || ((y2-h2)>=(y1-h1)) || ((y2+h2) <= (y1 + h1))) {
			System.out.println("Overlap");
		}
		else {
			System.out.println("Not");
		}
		
	}

}