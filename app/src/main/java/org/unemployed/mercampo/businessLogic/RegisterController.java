package org.unemployed.mercampo.businessLogic;

import android.app.Activity;

import java.util.concurrent.ExecutionException;


public class RegisterController {

	private Activity activity;

	public RegisterController(Activity activity) {
		this.activity = activity;
	}

	public enum RegisterStatus {
		PENDING,
		INVALID_NAME,
		INVALID_EMAIL,
		NAME_NOT_UPDATED,
		INVALID_PASSWORD,
		REGISTER_SUCCESSFUL,
		REGISTER_UNSUCCESSFUL,
		PASSWORDS_DO_NOT_MATCH
	}

	public static boolean invalidEmail(String email) {
		return email == null || !email.toLowerCase().matches("^[-a-z0-9~!$%^&*_=+}{\\'?]+(\\.[-a-z0-9~!$%^&*_=+}{\\'?]+)*@([a-z0-9_][-a-z0-9_]*(\\.[-a-z0-9_]+)*\\.(aero|arpa|biz|com|coop|edu|gov|info|int|mil|museum|name|net|org|pro|travel|mobi|[a-z][a-z])|([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}))(:[0-9]{1,5})?$");
	}

	public RegisterStatus registerWithEmailAndPassword(String name, String email, String password, String verification_password) throws ExecutionException, InterruptedException {
		if (name == null || name.isEmpty()) {
			return RegisterStatus.INVALID_NAME;
		} else if (RegisterController.invalidEmail(email)) {
			return RegisterStatus.INVALID_EMAIL;
		} else if (password == null || password.length() < 8) {
			return RegisterStatus.INVALID_PASSWORD;
		} else if (!verification_password.equals(password)) {
			return RegisterStatus.PASSWORDS_DO_NOT_MATCH;
		}


		return RegisterStatus.PENDING;
	}
}
