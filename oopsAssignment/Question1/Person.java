package Question1;

//date_of_registration, delivery_address, contactno, "".
public class Person {

	private String date_of_registration;
	private String delivery_address;
	private String contactno;
	private String email_id;

	public Person() {
		super();
		this.date_of_registration = date_of_registration;
		this.delivery_address = delivery_address;
		this.contactno = contactno;
		this.email_id = email_id;
	}

	public String getDate_of_registration() {
		return date_of_registration;
	}

	public void setDate_of_registration(String date_of_registration) {
		this.date_of_registration = date_of_registration;
	}

	public String getDelivery_address() {
		return delivery_address;
	}

	public void setDelivery_address(String delivery_address) {
		this.delivery_address = delivery_address;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public void PersonDisplay() {
		System.out.println("date_of_registration is:" + date_of_registration + " delivery_address is:"
				+ delivery_address + " contactno is:" + contactno + " email_id is:" + email_id);
	}

}
