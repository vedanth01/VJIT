package com.mobie.DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.mobile.DTO.*;
//import com.mobile.DTO.PurchaseDetails;
//import com.mobilepurchase.services.ResultSet;
//import com.mobilepurchase.services.SQLException;

public class AdminDaoImp implements AdminDAO{
	//Connection con;
	@Override
	public void insertCusPurDetails(int purchaseId, String name, String mailId, String phoneNum,  int mobileId) {
		try {
			Connection con;
			con=DBUtil.getDBConnection();
		// TODO Auto-generated method stub
		PreparedStatement ps=con.prepareStatement("Insert into purchaseDetails values(?,?,?,?,?,?)");
		ps.setInt(1, purchaseId);
		ps.setString(2,name);
		ps.setString(3, mailId);
		ps.setString(4, phoneNum);
		ps.setDate(5, getCurrentDate());
		ps.setInt(6, mobileId);
		//ps.setInt(7, deptno);
		ps.executeUpdate();
		System.out.println("Inserted Successfully");
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}

	 Date getCurrentDate() {
		// TODO Auto-generated method stub
			   java.util.Date today = new java.util.Date();
			   return new java.sql.Date(today.getTime());
			}
		

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMobileId(int mobileId) {
		// TODO Auto-generated method stub
		try
		{
			//System.out.println("this is in DAO Imp");
			Connection con;
			con =DBUtil.getDBConnection();
			PreparedStatement ps=con.prepareStatement("delete from purchaseDetails where mobileId=?");
			ps.setInt(1, mobileId);
			//ResultSet rs = ps.executeQuery();
			ps.executeUpdate();
			System.out.println("Record Deleted successfully");
			
		}
		catch (SQLException e)
		{
		e.printStackTrace();
		}

	}

	@Override
	public List<MobileDetails> view() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub\
		Connection con;
		con =  DBUtil.getDBConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select mobileId, name, price, quantity from Mobiles");
		List<MobileDetails> mlist = new ArrayList<>();
		//MobileDetails m=new MobileDetails();
		while (rs.next()) {
			MobileDetails m=new MobileDetails();
			// MobileDetails mobile = new MobileDetails(rs.getInt("MobileId"), rs.getString("name"), rs.getInt("price"), rs.getString("quantity"));
		       m.setNumber(rs.getInt(1));
		       m.setName(rs.getString(2));
		       m.setPrice(rs.getDouble(3));
		       m.setQuantity(rs.getString(4));
			mlist.add(m);
			//mlist.toString();
		   }
		//System.out.println(mlist);
		rs.close();
		return mlist;
		
		}

	@Override
	public void searchById(int id) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println("this is in DAO Imp");
			Connection con;
		con =DBUtil.getDBConnection();
		Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet rset = stmt.executeQuery("select mobileId, name, price, quantity from mobiles");
		rset.next();
		if(rset.getInt(3)>=25000)
		{
		//PreparedStatement ps=con.prepareStatement("select * from mobiles where price>=25000");
		//ps.setInt(1, id);
		ResultSet rset1 = stmt.executeQuery("select * from mobiles where price>=25000");
		
		while (rset1.next())
		{
			// PurchaseDetails ps = new PurchaseDetails(rs.getInt("purchaseId"), rs.getString("cname"),rs.getString("mailId"),rs.getString("PhoneNum"),rs.getDate("purchaseDate") ,rs.getDouble("mobileId"));
			System.out.println(rset1.getInt("MobileId")+" "+ rset1.getString("name")+" "+ rset1.getInt("price")+" "+ rset1.getString("quantity"));   
			//System.out.println(rs);
			//System.out.println("this is in DAO ");
		}
		}
		else	
		{
			//PreparedStatement ps=con.prepareStatement("select * from mobiles where price<25000");
			//ps.setInt(1, id);
			ResultSet rset1 = stmt.executeQuery("select * from mobiles where price<25000");
			
			while (rset1.next())
			{
				// PurchaseDetails ps = new PurchaseDetails(rs.getInt("purchaseId"), rs.getString("cname"),rs.getString("mailId"),rs.getString("PhoneNum"),rs.getDate("purchaseDate") ,rs.getDouble("mobileId"));
				System.out.println(rset1.getInt("MobileId")+" "+ rset1.getString("name")+" "+ rset1.getInt("price")+" "+ rset1.getString("quantity"));   
				//System.out.println(rs);
				//System.out.println("this is in DAO ");
			}
		}
		//stmt.close();
		}
		catch (SQLException e)
		{
		e.printStackTrace();
		}
	}

		
}
