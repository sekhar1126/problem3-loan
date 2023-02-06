package Selection;



 class loan {
private int acc_no;
 private int acc_bal;
private int salary;
private String loantype;
 private int loanamountexpected;
 private int emiexpected;
public loan(int acc_no, int acc_bal, int salary, String loantype, int loanamountexpected, int emiexpected) {
	super();
	this.acc_no = acc_no;
	this.acc_bal = acc_bal;
	this.salary = salary;
	this.loantype = loantype;
	this.loanamountexpected = loanamountexpected;
	this.emiexpected = emiexpected;
}
 public boolean validate() {
	 if(acc_no<1000||acc_no>9999) {
		 System.out.println("invalid account number:  account number must be 4digits");
		 return false;
	 }
 
 if(acc_bal<1000) {
	 System.out.println("Insufficient balance :  balance must be greater than $1000 ");
	 return false;
 }
	return true;
}
 public boolean checkloaneligibility() {
	 int eligibleloanammount=0;
	 int eligibleemi=0;
	 if(salary>25000&&loantype.equals("Car")){
		 eligibleloanammount=500000;
		 eligibleemi=36;
	 }
	 if(salary>50000&&salary<=75000&&loantype.equals("House")) {
		 eligibleloanammount=6000000;
		 eligibleemi=60;
		 
	 }
	 if(salary>75000&&loantype.equals("Business")) {
		 eligibleloanammount=75000000;
		 eligibleemi=84;
		 
	 }if(eligibleloanammount==0) {
		 System.out.println("you are not eligible for loan");
		return false; 
	 }
	 if(loanamountexpected>eligibleloanammount) {
		 System.out.println("you are not eligible for loan");
			return false; 
	 }
	 if (loanamountexpected > eligibleloanammount|| emiexpected > eligibleemi) {
			 System.out.println(" Loan not provided. The loan amount and the number of EMIs expected by the customer should be less than or equal to the loan amount and the number of EMIs decided by the bank respectively.");
			 return false;
			 }
	 System.out.println("Eligible Loan Amount: " + eligibleloanammount);
	 System.out.println("Eligible EMIs: " + eligibleemi);
	 return true;
	 }


 }
public class tester {

	public static void main(String[] args) {
		loan loan = new loan(1001, 250000, 40000, "Car", 300000, 30);
        if (loan.validate()) {
             loan.checkloaneligibility();
              }
	}

}
