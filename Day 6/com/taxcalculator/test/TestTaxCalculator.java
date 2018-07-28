package com.taxcalculator.test;
//JUnit for Taxcalculator 
import org.junit.Assert;
import org.junit.Test;

import com.taxcalculator.CountryNotValidException;
import com.taxcalculator.EmployeeNameInvalidException;
import com.taxcalculator.TaxCalculator;
import com.taxcalculator.TaxNotEligibleException;

public class TestTaxCalculator {

	//Test case where country is not "India"
	@Test (expected = CountryNotValidException.class)
	public void testCase1() throws EmployeeNameInvalidException, TaxNotEligibleException, CountryNotValidException {
		TaxCalculator taxCalculator = new TaxCalculator("Ron",34000,false);
			@SuppressWarnings("unused")
			double tax = taxCalculator.getTaxAmount();
			//Assert.assertEquals(0, tax,0);
	}

	//Test case where salary is to low for tax
	@Test (expected = TaxNotEligibleException.class)
	public void testCase2() throws EmployeeNameInvalidException, TaxNotEligibleException, CountryNotValidException {
		TaxCalculator taxCalculator = new TaxCalculator("Tom",1000,true);
		@SuppressWarnings("unused")
		double tax = taxCalculator.getTaxAmount();
		//Assert.assertEquals(0, tax,0);
	}

	//Test case where tax calculation  is checked
	@Test
	public void testCase3() throws EmployeeNameInvalidException, TaxNotEligibleException, CountryNotValidException {
		TaxCalculator taxCalculator = new TaxCalculator("Jack",55000,true);
		double tax = taxCalculator.getTaxAmount();
		Assert.assertEquals(3300, tax,0);
	}

	//Test where employee name is null
	@Test (expected = EmployeeNameInvalidException.class)
	public void testCase4() throws EmployeeNameInvalidException, TaxNotEligibleException, CountryNotValidException {
		TaxCalculator taxCalculator = new TaxCalculator("",30000,true);
		@SuppressWarnings("unused")
		double tax = taxCalculator.getTaxAmount();
		//Assert.assertEquals(0, tax,0);
	}

}
