package Question9;


public class demo {
	public static void main(String[] args) {
		demo obj = new demo();
		System.out.println("Hashcode of object= " + obj.hashCode());
		obj = null;
		// calling garbage collector
		System.gc();
		System.out.println("end of garbage collection");

	}

	protected void finalize() {
		System.out.println("finalize method called");
	}

}
