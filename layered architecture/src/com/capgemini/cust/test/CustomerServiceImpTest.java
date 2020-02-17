package com.capgemini.cust.test;

import static org.junit.jupiter.api.Assertions.fail;

import java.sql.Date;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.capgemini.cust.bean.Customer;
import com.capgemini.cust.service.CustomerServiceImp;
import com.capgemini.cust.service.ICustomerService;

class CustomerServiceImpTest {
	static ICustomerService service;
	
	@BeforeAll
	public static void setUp() {
		service=new CustomerServiceImp();
	}
    @Test
	void testAddCustomer() {
    	
    	Customer cust=new Customer();
    	cust.setCid(100);
    	cust.setCustomername("samreen");
    	cust.setAmount(90000);
    	cust.setDop(new  Date(2020,2,10));
    	int res=  service.addCustomer(cust);
	
	}

	@Test
	void testIsValidCid() {
	
	}

	@Test
	void testIsValidCustomername() {
		
	}

	@Test
	void testUserValidations() {
	
	}

}
