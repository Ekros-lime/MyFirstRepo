package ex7;

public class Transactions {
	double amount;
	double balance;
	String description;
	char type;
    java.util.Date date;
    
    public Transactions(char type, double amount, double balance, String desciption) {
        this.amount = amount;
        this.balance = balance;
        this.description = desciption;
        this.type = type;
        this.date = new java.util.Date();
    }

    public void tostring() {
        System.out.println("type:" + this.type + " Date:" + date + " amount:" + this.amount + " balance:" + this.balance);
    }
}
