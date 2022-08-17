import java.util.Scanner;

class PaymentMethod{

	double amount;

	PaymentMethod(){
		amount = 500.0;
	}

	public PaymentMethod(double amount) {
		this.amount = amount;
		System.out.println("[Payment Method] Object constructed - Parametrized Const");
	}

	void pay( double amount){
		System.out.println("[Payment Method] Payment of \u20b9 "+amount+"completed");

	}
}

class PayByDebitCard extends PaymentMethod{

	String cardNum;
	int cvv;
	int pin;

	PayByDebitCard(){
		cardNum = "7878-0909-8989-1212";
		cvv = 789;
		pin = 9809;
		System.out.println("[PayByDebitCard] object constructed - Default Constructor");
	}

	void pay(double amount){
		System.out.println("````````````````````````````````````````");
		System.out.println("Paying by Debit Card "+cardNum);
		System.out.println("Payment Complete");
		System.out.println("````````````````````````````````````````");
	}
	
}

class PayByNetBanking extends PaymentMethod{
	String userName;
	String pswd;

	PayByNetBanking(){
		userName = "User0101";
		pswd = "Qwerty901!";
		System.out.println("[PayByNetBanking] object constructed - Default constructor");
	}

	void pay(double amount){
		System.out.println("````````````````````````````````````````");
		System.out.println("Paying by Net banking User Name "+userName);
		System.out.println("Payment Complete");
		System.out.println("````````````````````````````````````````");
	}

}

class PayByUPI extends PaymentMethod{
	String upiID;

	PayByUPI(){
		upiID="myupiID@bankname";
		System.out.println("[PayByUPI] object constructed - Default constructor");
	}

	void pay(double amount){
		System.out.println("````````````````````````````````````````");
		System.out.println("Paying by UPI ID "+upiID);
		System.out.println("Payment Complete");
		System.out.println("````````````````````````````````````````");
	}
	
}

class AmazonPay{
	
	PaymentMethod selectPaymentMethod(int option) {
		
		PaymentMethod method = null;
		
		if(option == 1) {
			method = new PayByDebitCard();

		}else if(option == 2) {
			method = new PayByNetBanking();

		}else if(option == 3) {
			method = new PayByUPI();

		}else {
			System.err.println("Select the Payment Method First");
		}
		
		
		return method;
		
	}
	
}

public class PracticalExercise2 {

	public static void main(String[] args) {
		
		AmazonPay pay = new AmazonPay();

		Scanner scanner = new Scanner(System.in);

		System.out.println("1: Pay By Debit Card");
		System.out.println("2: Pay by Net Banking");
		System.out.println("3: Pay by UPI ID");
		System.out.println("Select the Option: (1-3): ");
		int option = scanner.nextInt();
		scanner.close();
		
		PaymentMethod method = pay.selectPaymentMethod(option);

		if(method!=null){
			method.pay(800.0);

		}

	}

}
