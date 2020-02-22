package com.presentation;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.mobile.DTO.MobileDetails;
import com.mobilepurchase.services.AdminServices;
//import com.mobilepurchase.services.AdminServices;
import com.mobilepurchase.services.AdminServicesImp;

public class MobileUI {
	
		public static void main(String[] args) throws ClassNotFoundException, SQLException
		{
		AdminServices as = new AdminServicesImp();
		//Adminstration a = new Adminstration();
		Scanner sc = new Scanner(System.in);
		System.out.println("please select one of the following operations 1.Insert into purchaseDetails \n 2.search mobile details by range of price \n 3.delete mobile details by id \n 4.View mobile details ");
		int purchaseId,c,mobileId;
		c=sc.nextInt();
		String cname;
		String mailId;
		String phoneNum;
		switch(c)
		{
		case 1: System.out.println("please enter the following deatails");
				System.out.println("enter PurchaseID");
				purchaseId=sc.nextInt();
				System.out.println("enter Customer Name");
				cname=sc.next();
				System.out.println("enter Mail Id");
				mailId=sc.next();
				System.out.println("enter Phone Number");
				phoneNum=sc.next();
				System.out.println("enter MobileId");
				mobileId=sc.nextInt();
				as.insertCusPurDetails(purchaseId, cname, mailId, phoneNum , mobileId);
				break;
		case 2: System.out.println("please enter Range of the mobile price You want");
				int range=sc.nextInt();
				as.searchById(range);
				break;
		case 3: System.out.println("please enter the mobileId u want to delete");
				int id=sc.nextInt();
				as.deleteMobileId(id);
				break;
		case 4:System.out.println("Mobile Details are as follows");
				List<MobileDetails> m=as.view();
				for(int i=0;i<m.size();i++)
				System.out.println(m.get(i).toString());
				break;
		default: System.out.println("please give a valid operation");
		}
		/*= sc.nextInt();
		
		//Date purchaseDate = a.getCurrentDate();
		int mobileId = sc.nextInt();*/
		//as.insertCusPurDetails(purchaseId, cname, mailId, phoneNum , mobileId);
		//as.searchById(1001);
//		 System.out.println("please enter Range of the mobile price You want");
//			int range=sc.nextInt();
//			as.searchById(range);
		//as.deleteMobileId(1001);
		
//		List<MobileDetails> m=as.view();
//		for(int i=0;i<m.size();i++)
//			System.out.println(m.get(i).toString());
		//sc.close();
		}
	}

