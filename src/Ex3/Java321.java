package Ex3;

import java.util.Scanner;

public class Java321 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter year: ");
		int year = input.nextInt();
		System.out.print("Enter month: ");
		int month = input.nextInt();
		System.out.print("Enter the day of the month: ");
		int day = input.nextInt();
		
		if(month == 1||month == 2) {
			month+=12;
			year--;
		}
		
		int j = year/100;
		int k = year % 100;
		
		int h = (day + 26*(month+1)/10+k+k/4+j/4+5*j)%7;
		
		if(h == 0) {
			System.out.println("Day of the week is Saturday");
		}
		else if(h == 1) {
			System.out.println("Day of the week is Monday");
		}
		else if(h == 2) {
			System.out.println("Day of the week is Tuesday");
		}
		else if(h == 3) {
			System.out.println("Day of the week is Wednesday");
			}
		else if(h == 4) {
			System.out.println("Day of the week is Thursday");
		}
		else if(h == 5) {
			System.out.println("Day of the week is Friday");
		}
		else if(h == 6) {
			System.out.println("Day of the week is Sunday");
		}
	}

}
