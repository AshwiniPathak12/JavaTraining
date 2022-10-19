package Question3;

public class Main {

	public static void main(String[]agrs) {
		Branch_Obj branch=new Branch_Obj("1", "idbi bank", "aundh pune");
		Customer customer=new Customer("1", "ashwini", "katrj", "8 jully", "9 dec", branch);
		Customer_Account_Statement cad=new Customer_Account_Statement("1", "32618", "12500", "4300", "4 aug");
		branch.BranchDisplay();
		customer.CustomerDisplay();
		cad.customerDisplay();
		
		
	}
}
