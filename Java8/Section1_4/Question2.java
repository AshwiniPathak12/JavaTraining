package Section1_4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question2 {

	public static void main(String[] args) {

		String str = "Taj is ast situated ast in Agra";

		List<String> list = Arrays.asList(str.split(" "));

		Object[] a = list.toArray();

		List<String> list2 = list.stream().filter(i -> i.contains("ast")).collect(Collectors.toList());

		System.out.println(list2);
	}
}
