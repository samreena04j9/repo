package com.capgemini.cust.dao;

import java.util.List;

import com.capgemini.cust.bean.Customer;

public interface ICustomerDao {
	int addCustomer(Customer c);
int updateCustomer(Customer c);
Customer getCustomerByCid(int cid);
int deleteCustomerByCid(int cid);
 List<Customer> getAllCustomerByCid();


}
