package day10;

public class AccountMain {

	public static void main(String[] args) {
		Account  accObj = new Account();
		
		accObj.setAcc_no(1234);
		accObj.setName("Priya");
		accObj.setAmount(500000);
		
		System.out.println(accObj.getAcc_no());
		System.out.println(accObj.getName());
		System.out.println(accObj.getAmount());
		
	}

}
