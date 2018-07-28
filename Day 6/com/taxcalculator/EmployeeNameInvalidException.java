package com.taxcalculator;

//Exception for employee name invalid
public class EmployeeNameInvalidException extends Exception {
	public EmployeeNameInvalidException(String message) {
		super(message);
	}
}
