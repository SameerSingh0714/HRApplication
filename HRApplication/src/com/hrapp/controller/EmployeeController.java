package com.hrapp.controller;

import java.util.Scanner;

import com.hrapp.model.Employee;
import com.hrapp.services.EmployeeCrendentialService;

public class EmployeeController {

	public static void main(String[] args) {
		Employee employee = new Employee("Sameer", "Singh");

		EmployeeCrendentialService service = new EmployeeCrendentialService();
		String generatedEmail;
		char[] generatedPassword;

		Scanner sc = new Scanner(System.in);

		System.out.println("\n please enter opriion: ");
		System.out.println("\n 1. Technical\n 2. Admin \n 3. Human Resource\n 4. Legal");

		int option = sc.nextInt();

		switch (option) {
		case 1:

			generatedEmail = service.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "Technical");
			generatedPassword = service.generatePassword();
			service.showCredentials(employee, generatedEmail, generatedPassword);

			break;
		case 2:
			generatedEmail = service.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "Admin");
			generatedPassword = service.generatePassword();
			service.showCredentials(employee, generatedEmail, generatedPassword);
			break;
		case 3:
			generatedEmail = service.generateEmailAddress(employee.getFirstName(), employee.getLastName(),
					"HR");
			generatedPassword = service.generatePassword();
			service.showCredentials(employee, generatedEmail, generatedPassword);
			break;
		case 4:
			generatedEmail = service.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "Legal");
			generatedPassword = service.generatePassword();
			service.showCredentials(employee, generatedEmail, generatedPassword);
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}

	}
}
