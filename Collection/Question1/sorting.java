package Question1;

import java.util.ArrayList;
import java.util.Collections;

public class sorting {

	// WAP to sort Collection elements in ascending order.
	public static void main(String[] agrs) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("z");
		al.add("v");
		al.add("a");

		Collections.sort(al);
		System.out.println(al);

	}
}
