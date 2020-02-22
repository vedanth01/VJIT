package com.mobilepurchase.services;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.mobie.DAO.*;
import com.mobile.DTO.*;
public class AdminServicesImp implements AdminServices {
	
	Connection con;
	@Override
	public void insertCusPurDetails(int purchaseId, String name, String mailId, String phoneNum, int mobileId) {
		// TODO Auto-generated method stub
		AdminDaoImp a=new AdminDaoImp();
		a.insertCusPurDetails(purchaseId, name, mailId, phoneNum, mobileId);
		//return 0;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMobileId(int id) {
		// TODO Auto-generated method stub
		AdminDAO a=new AdminDaoImp();
		a.deleteMobileId(id);
	}

	@Override
	public List<MobileDetails> view() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		AdminDAO a=new AdminDaoImp();
		List<MobileDetails> m= a.view();
		return m;
	}

	@Override
	public void searchById(int id) {
		// TODO Auto-generated method stub
		AdminDAO a=new AdminDaoImp();
		System.out.println("this is in services");
		a.searchById(id);
	}
	
}
