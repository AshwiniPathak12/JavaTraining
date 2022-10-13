package com.yash;

import java.util.concurrent.TimeUnit;

public class Question7 {
	public static void main(String[] agrs) {

		System.out.println("Finalizedemo.main() starts");
		String s = new String("Uddhav");

		s = null;
		System.gc();
		System.out.println("Finalizedemo.main() ends");
	}

	public void finalize() {
		System.out.println("Finalizedemo.finalize() called");
	}

//	for (int i = 0;; i++) {
//	StringBuffer sb = new StringBuffer("Ashu");
//	if (i == 1000) {
//		sb = null;
//	}
//	System.out.println(sb);
//}

}
