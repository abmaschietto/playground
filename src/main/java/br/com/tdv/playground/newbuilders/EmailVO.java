package br.com.tdv.playground.newbuilders;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.management.InvalidAttributeValueException;

public class EmailVO {

	private static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
			Pattern.CASE_INSENSITIVE);

	private static boolean validate(String emailStr) {
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
		return matcher.find();
	}
	
	private String email;

	public EmailVO(String email) throws InvalidAttributeValueException {
		super();
		if(email != null || validate(email)) {
			this.email = email;
		}
		else {
			throw new InvalidAttributeValueException("Este email é inválido");
		}
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "EmailVO [email=" + email + "]";
	}
	
}
