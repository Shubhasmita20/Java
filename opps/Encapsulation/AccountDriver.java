package encapsulation;

public class AccountDriver {
	public static void main(String[] args) {
		
		Account acc = new Account();
		
		acc.setAccountNumber(123456789);
		acc.setName("Alex");
		acc.setEmail("alex@gjk.com");
		acc.setBalance(658988);
		
		System.out.println("AccountNumber: "+ acc.getAccountNumber());
		System.out.println("AccountHolderName: "+ acc.getName());
		System.out.println("Email: "+ acc.getEmail());
		System.out.println("Total Amount: "+ acc.getBalance());
	}

}
