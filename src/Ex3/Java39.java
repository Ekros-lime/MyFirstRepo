package Ex3;

import java.util.Scanner;

public class Java39 {

	public static void main(String[] args) {
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int i = 9;
		int sum = 0;
		int num = n;
		boolean flag = false;
		String z = "";
		
		while(n > 0){
			sum += (n % 10) * i--;
			n /= 10;
		}
		
		while(i > 0) {
			z += "0";
			i--;
		}
		
		sum %= 11;
		if(sum == 10) {
			flag = true;
		}
		else {
			num *= 10;
			num += sum;
		}
		
		if(flag) {
			System.out.println("The ISBN-10 number is " + z + num + 'X');
		}
		else {
			System.out.println("The ISBN-10 number is " + z + num);
		}
	}

}
