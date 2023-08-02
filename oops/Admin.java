package oops;

public class Admin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount SA = new SavingAccount();
		SA.setBalance(500);
		System.out.println(SA.getBalance());
		SA.addBalance(10000);
		System.out.println(SA.getBalance());
		
		CurrentAccount CA = new CurrentAccount();
		CA.setBalance(20000);
		System.out.println(CA.getBalance());
		CA.display("XYZ");
		System.out.println(CA.getBalance());
	}

}
