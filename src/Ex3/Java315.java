package Ex3;

import java.util.Scanner;
import java.util.Random;

public class Java315 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		
		Random random = new Random();
		int an = random.nextInt(900) + 100;
		int in = input.nextInt();
		int i = 6;
		
		int an1 = an % 10;
		int an2 = (an / 10) % 10;
		int an3 = an / 100;
		if(in == an) {
			System.out.println("The bonus is $10000");
		}
		else if(((an3*100+an1*10+an2)==in)||((an2*100+an1*10+an3)==in)||((an2*100+an3*10+an1)==in)||((an1*100+an3*10+an2)==in)||((an1*100+an2*10+an3)==in)){
			System.out.println("The bonus is $3000");
		}
		else if((an1 == in %10)||(an1==in/10%10)||(an1==in/100)||(an2 == in %10)||(an2==in/10%10)||(an2==in/100)||(an3 == in %10)||(an3==in/10%10)||(an3==in/100)) {
			System.out.println("The bonus is $1000");
		}
		else {
			System.out.println("The bonus is $0");
		}
		System.out.println(an);
	}		
}

