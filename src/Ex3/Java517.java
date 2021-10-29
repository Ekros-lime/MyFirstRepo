package Ex3;

import java.util.Scanner;

public class Java517 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 1 and 15: ");
		
		int n = input.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n * 2 - 1; j++) {
				if(j <= n-i || j >= n + i) {
					System.out.print("  ");
				}
				else {
					if(j <= n) {
						System.out.print((n-j+1) + " ");
					}
					else {
						System.out.print((1+j-n) + " ");
					}
				}
			}
			System.out.println("");
		}
	}

}
