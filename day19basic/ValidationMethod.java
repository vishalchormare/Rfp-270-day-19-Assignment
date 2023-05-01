package day19basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationMethod {

	public static boolean firstNameValidation(String value) {
		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
		Matcher match = pattern.matcher(value);
		return (match.find() && match.group().equals(value));

	}

	public static boolean lastNameValidation(String value) {
		Pattern ptrn = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
		Matcher match = ptrn.matcher(value);
		return (match.find() && match.group().equals(value));
	}

	public static boolean emailValidation(String value) {

		Pattern ptrn = Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
		Matcher match = ptrn.matcher(value);
		return (match.find() && match.group().equals(value));
	}

	public static boolean moblieNumberValidaltion(String value) {
		Pattern ptrn = Pattern.compile("(0/91)?[7-9][0-9]{9}");
		Matcher match = ptrn.matcher(value);
		return (match.find() && match.group().equals(value));
	}

	public static boolean passwordValidation(String value) {

		Pattern ptrn = Pattern.compile("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$");
		Matcher match = ptrn.matcher(value);
		return (match.find() && match.group().equals(value));

	}
}
