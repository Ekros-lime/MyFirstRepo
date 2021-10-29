package Ex3;

public class Java324 {

	public static void main(String[] args) {
		int i = (int)Math.random()*13 + 1;
		int c = (int)Math.random()*4;
		String k = "";
		
		if(i == 1) {
			k+="Ace";
		}
		else if(i <= 10) {
			k+=String.valueOf(i);
		}
		else if(i == 11) {
			k+="Jack";
		}
		else if(i == 12) {
			k+="Queen";
		}
		else if(i == 13) {
			k+="King";
		}
		
		if(c == 0) {
			k+=" of Clubs";
		}
		else if(c == 1) {
			k+=" of Diamonds";
		}
		else if(c == 2) {
			k+=" of Hearts";
		}
		else {
			k+=" of Spades";
		}
		
		System.out.println("The card you pick is " + k);
	}

}
