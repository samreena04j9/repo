package com.capgemini.cust.service;

import java.util.List;

import com.capgemini.cust.bean.Customer;
import com.capgemini.cust.dao.CustomerDao;
import com.capgemini.cust.dao.ICustomerDao;

public class CustomerServiceImp implements ICustomerService {
	ICustomerDao dao = new CustomerDao();

	@Override
	public int addCustomer(Customer c) {

		return dao.addCustomer(c);
	}

	@Override
	public int updateCustomer(Customer c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Customer getCustomerByCid(int cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteCustomerByCid(int cid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Customer> getAllCustomerByCid() {
		// TODO Auto-generated method stub
		return null;
	}

	public static boolean isValidCid(int cid) {
		boolean flag = false;
		if (cid != 0 && (cid > 99 && cid < 1000)) {
	  		flag = true;
		}
		return flag;

	}

	public static boolean isValidCustomername(String customername) {
		boolean flag = false;
		if (customername.length() >= 3) {
			flag = true;
		}
		return flag;

	}

	public static boolean userValidations(Customer c) {
		boolean flag = false;
		
		
		System.out.println(isValidCid(c.getCid()));
		System.out.println(isValidCustomername(c.getCustomername()));
		
		if (isValidCid(c.getCid())   &&  isValidCustomername(c.getCustomername())) {
			
			flag = true;
			
		}
		
		
 return flag;
}
}
