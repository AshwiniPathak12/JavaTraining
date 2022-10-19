package Questin11;

import java.util.Date;

public class Test {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date dob = new Date(1991,10, 07);
		Date doj = new Date(2022, 05, 07);
         Employee e = new Employee(1,"ashu","pune", 45000, dob, doj);
         System.out.println(e);
	}

}
