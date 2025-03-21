

class BankSystem {
protected double balance ;

public BankSystem(double balance){

	this.balance= balance;
}
	
 public void deposit ( double amount ){
 	if (amount >0 ){

 		balance = balance + amount;
 		System.out.println("Deposited Ammount : " + amount);
 		System.out.println("Total balance : " + balance);


 	}

 	else {
    System.out.println("Invalid Amount ....! Amaout must be greater than 0 "); 
 	}
 }

 public void withdraw ( double amount ){
 	if (amount > 100 && amount < balance) {
 		balance = balance- amount ;
 		System.out.println("withdrawal Amount is " + amount);
 		System.out.println("Remaining balance is "+ balance  ); 
 	}
 	else {
 		System.out.println("Invalid withdrawal Amount ..... ! "); 

 	}


 }

 public void check (){
 	System.out.println("Current Balance is "+ balance); 
 }
 
}
  class SavingsAccount extends BankSystem{
   double balance;
  public SavingsAccount (double balance){
  	super(balance);

  }
@Override

public void withdraw (double amount){
	if (balance - amount <100){
		System.out.println("Can't Be withdrawal ..!"); 
	}
	else {
		super.withdraw(amount);
	}
}

  }

public class BankAccount{
	public static void main(String[] args) {
		SavingsAccount SA = new SavingsAccount(1000);
		SA.deposit(200);
		SA.withdraw(500);
		SA.check() ;

	}
}


