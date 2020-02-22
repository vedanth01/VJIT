package com.mobie.DAO;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import com.mobile.DTO.*;
public interface AdminDAO {
	public void insertCusPurDetails(int purchaseId, String name, String mailId, String phoneNum, int mobileId);
	public void update();
	public void deleteMobileId(int id);
	public List<MobileDetails> view() throws ClassNotFoundException, SQLException;
	public void searchById(int id);
}
