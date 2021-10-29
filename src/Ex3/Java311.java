package Ex3;

import java.util.Scanner;

public class Java311 {

	public static void main(String[] args) {
		System.out.print("Enter the month and year: ");
		Scanner input = new Scanner(System.in);
		
		int mon = input.nextInt();
		int year = input.nextInt();
		int day = 0;
		String month = "";
		
		switch(mon) {
		case 1:
			month = "January";
			break;
		case 2:
			month = "February";
			break;
		case 3:
			month = "March";
			break;
		case 4:
			month = "April";
			break;
		case 5:
			month = "May";
			break;
		case 6:
			month = "June";
			break;
		case 7:
			month = "July";
			break;
		case 8:
			month = "August";
			break;
		case 9:
			month = "September";
			break;
		case 10:
			month = "October";
			break;
		case 11:
			month = "November";
			break;
		case 12:
			month = "December";
			break;
		default:
			break;
	}
		
		if(year % 4 == 0 || year % 100 == 0) {
			if(mon == 2) {
				day = 29;
			}
			else if(mon <= 7) {
				if(mon % 2 == 1) {
					day = 31;
				}
				else {
					day = 30;
				}
			}
			else {
				if(mon % 2 == 1) {
					day = 30;
				}
				else {
					day = 31;
				}
			}
		}
		else{
			if(mon == 2) {
				day = 28;
			}
			else if(mon <= 7) {
				if(mon % 2 == 1) {
					day = 31;
				}
				else {
					day = 30;
				}
			}
			else {
				if(mon % 2 == 1) {
					day = 30;
				}
				else {
					day = 31;
				}
			}
		}
		
		System.out.println(month + " " + year + "has " + day + " days");
	}

}
