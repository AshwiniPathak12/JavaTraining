package Question1;

public class Main {

	public static void main(String[]agrs) {
	
	Department [] dept=new Department[2];
	dept[0]=new Department("dept 1", "IT");
	dept[1]=new Department("dept 2", "HR");
	
	Empolyee employee=new Empolyee("12500", " 8 feb ", " Pune", dept[0], "ashwini.lohar@yash.com", "9960873595");
	employee.EmpolyeeDisplay();
	
	Customer customer=new Customer("1","ashwini","pune","13 jully");
	customer.CustomerDisplay();
	
	
	}
}