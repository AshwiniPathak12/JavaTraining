package Question1;

public class Empolyee extends Person {

	// salary, date_of_joining, base_location, deptobj, contactno, emailid.

	private String salary;
	private String date_of_joining;
	private String base_location;
	private Department deptobj;
	private String contactno;
	private String emailid;

	public Empolyee(String salary, String date_of_joining, String base_location, Department dept, String contactno,
			String emailid) {
		super();
		this.salary = salary;
		this.date_of_joining = date_of_joining;
		this.base_location = base_location;
		this.deptobj = dept;
		this.contactno = contactno;
		this.emailid = emailid;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getDate_of_joining() {
		return date_of_joining;
	}

	public void setDate_of_joining(String date_of_joining) {
		this.date_of_joining = date_of_joining;
	}

	public String getBase_location() {
		return base_location;
	}

	public void setBase_location(String base_location) {
		this.base_location = base_location;
	}

	

	public Department getDeptobj() {
		return deptobj;
	}

	public void setDeptobj(Department deptobj) {
		this.deptobj = deptobj;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public void EmpolyeeDisplay() {
		System.out.println("salary is:" + salary + " date_of_joining is:" + date_of_joining + " base_location is:"
				+ base_location + " deptobj is:" + deptobj + " contactno is:" + contactno + " emailid is:" + emailid);
	}

}
