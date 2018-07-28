package com.taxcalculator;

//Exception for country not valid
public class CountryNotValidException extends Exception {
	public CountryNotValidException(String message) {
		super(message);
	}
}
