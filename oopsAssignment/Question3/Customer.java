package Question3;

public class Customer {
//CustId, accountno, custname, cust_address, cust_dob, cust_account_opening_date, Branch_Obj
	private String CustId;
	private String custname;
	private String cust_address;
	private String cust_dob;
	private String cust_account_opening_date;
	private Branch_Obj branch_obj;

	public void CustomerDisplay() {
		System.out.println("CustId is:" + CustId + " custname is:" + custname + " cust_address is:" + cust_address
				+ " cust_dob is:" + cust_dob + " cust_account_opening_date is:" + cust_account_opening_date
				+ " Branch_Obj is:" + branch_obj);

	}

	public Customer(String custId, String custname, String cust_address, String cust_dob,
			String cust_account_opening_date, Branch_Obj branch_Obj) {
		super();
		CustId = custId;
		this.custname = custname;
		this.cust_address = cust_address;
		this.cust_dob = cust_dob;
		this.cust_account_opening_date = cust_account_opening_date;
		this.branch_obj = branch_Obj;
	}

	public String getCustId() {
		return CustId;
	}

	public void setCustId(String custId) {
		CustId = custId;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public String getCust_address() {
		return cust_address;
	}

	public void setCust_address(String cust_address) {
		this.cust_address = cust_address;
	}

	public String getCust_dob() {
		return cust_dob;
	}

	public void setCust_dob(String cust_dob) {
		this.cust_dob = cust_dob;
	}

	public String getCust_account_opening_date() {
		return cust_account_opening_date;
	}

	public void setCust_account_opening_date(String cust_account_opening_date) {
		this.cust_account_opening_date = cust_account_opening_date;
	}

	public Branch_Obj getBranch_obj() {
		return branch_obj;
	}

	public void setBranch_obj(Branch_Obj branch_obj) {
		this.branch_obj = branch_obj;
	}

}
