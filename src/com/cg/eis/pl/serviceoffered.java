package com.cg.eis.pl;
import java.util.*;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.Serice;
public class serviceoffered implements Serice
{
//public void data1(int id,double salary,String name,String designation,String insurancescheme)
//{
	/*Scanner sc=new Scanner(System.in);
	id=sc.nextInt();
	salary=sc.nextDouble();
	name=sc.next();
	designation=sc.next();
	*/
//}
	@Override
	public void insurance(double salary,String designation)
	{
		if(salary<=20000 && designation.contentEquals("analyst"))
{
	System.out.println("ve");
}
		else
			System.out.println("asd");
	}
public static void main(String args[])
{
	Employee e=new Employee();
	Serice s4=new serviceoffered();
	Scanner sc=new Scanner(System.in);
	int id=sc.nextInt();
	double salary=sc.nextDouble();
	String name=sc.next();
	String designation=sc.next();
		
	e.data1(id,salary,name,designation);
	e.insurance(salary, designation);
	System.out.println(id+"\n");
	System.out.println(name+"\n");
	System.out.println(salary+"\n");
	System.out.println(designation+"\n");
	
	}
}
