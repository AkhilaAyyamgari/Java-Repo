package com.regex.demo;
import java.util.regex.Pattern;

public class passwordDemo {

	public static void main(String[] args) {
		String password="Saarvi@05";
		// boolean result = Pattern.compile("[a-zA-Z0-9\\W{8}]").matcher("Saarvi@5").matches();
		boolean result = Pattern.compile("^(?=.*[a-z]+)(?=.*[A-Z]+)(?=.*[0-9]+)(?=.*[\\W]+).{8,14}$").matcher(password).matches();
		System.out.println("result:" + result);
	}

}
