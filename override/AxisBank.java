package override;

public class AxisBank extends BankInfo {

	public void deposit() {
		System.out.println("Deposit Axis");

	}
	public static void main(String[] args) {
		BankInfo bank=new BankInfo();
		bank.deposit();

	}

}
