package com.exception;

class PasswordValidationException extends Exception{
	public PasswordValidationException(String str) {
		super(str);
	}
}
public class CustomException {
	static void checkPassword(String password) {
		try {
		if(password.length()<8) {
			throw new PasswordValidationException("Password should be atleast 8 characters");
		}
		}catch(PasswordValidationException  e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
	
		String password="abcdefgh";
				checkPassword(password);
				System.out.println("some other code");
		
	}

}
