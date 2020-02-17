package com.capgemini.cust.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.capgemini.cust.bean.Customer;
import com.capgemini.cust.service.ICustomerService;

public class CustomerDao implements ICustomerDao  {
	Connection conn=DBUtil.getDBConnection();
	 PreparedStatement pstmt;
	@Override
	public int addCustomer(Customer c) {
		int count=0;
		
	try {
		  pstmt = conn.prepareStatement(IQuerryMapper.INSERT_CUSTOMER_QUERY);
		 pstmt.setInt(1,c.getCid());
		 pstmt.setString(2,c.getCustomername());
		 pstmt.setDouble(3,c.getAmount());
		count=pstmt.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return count;
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

}
