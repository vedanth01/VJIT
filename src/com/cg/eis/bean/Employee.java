package com.cg.eis.bean;

import com.cg.eis.service.Serice;
public class Employee implements Serice{

int id;
double salary;
String name,designation,insurancescheme;

public void data1(int id,double salary,String name,String designation)
{
	this.id=id;
	this.name=name;
	this.salary=salary;
	this.designation=designation;
}
public int getID()
{
	return id;
}
public void setId(int id)
{
	this.id=id;
}
public String getName()
{
	return name;
}
public void setName(String name)
{
	this.name=name;
}
public double getsalary()
{
	return salary;
}
public void setsalary(double salary)
{
	this.salary=salary;
}
	public String getdesignation()
	{
		return designation;
	}
	public void setdesignation(String designation)
	{
		this.designation=designation;
	}
	public void insurance(double salary,String designation)
	{
		if(salary<=20000 && designation.contentEquals("analyst"))
{
	System.out.println("ved");
}
		else
			System.out.println("asd");
	}
}