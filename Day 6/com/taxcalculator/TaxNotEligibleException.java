package com.taxcalculator;

//Exception for tax not eligible
public class TaxNotEligibleException extends Exception {
	public TaxNotEligibleException(String message) {
		super(message);
	}
}
