package com.hrapp.services;

import java.util.Random;

import com.hrapp.model.Employee;

public class EmployeeCrendentialService {

	public char[] generatePassword() {

		char[] password = new char[8];
		String captialLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialLetters = "!@#$%^&*_=+-/.?<>)";

		String values = captialLetters + smallLetters + numbers + specialLetters;

		Random random = new Random();

		for (int i = 0; i < 8; i++) {
			// Use of charAt() method : to get character value
			// Use of nextInt() as it is scanning the value as int
			password[i] = values.charAt(random.nextInt(values.length()));

		}

		return password;
	}

	public String generateEmailAddress(String firstName, String lastName, String department) {
		return firstName + lastName + "@" + department + ".com";
		//

	}

	public void showCredentials(Employee employee, String email, char[] generatedPassword) {
		System.out.println("\n Employee: " + employee.getFirstName());
		System.out.println("\n Email: " + email);
		System.out.println("\n Password: " + String.valueOf(generatePassword()));
	}
}
