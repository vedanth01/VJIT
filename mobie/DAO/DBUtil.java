package com.mobie.DAO;

//public class DBUtil {
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.io.InputStream;
	import java.sql.*;

	import java.util.*;

	public class DBUtil {

	private final static String PROPERTIES_FILE_NAME="Properties\\DBDetails.properties";

	public static Connection getDBConnection() throws SQLException
	{
	Properties prop= loadProperties();
	Connection conn=null;
	try
	{
	//	DriverManager.registerDriver(;
	String driverName=prop.getProperty("driver");
	Class.forName(driverName);
	String dbUrl=prop.getProperty("url");
	String user=prop.getProperty("username");
	String pwd=prop.getProperty("password");
	conn=DriverManager.getConnection(dbUrl,user,pwd);
	}catch(ClassNotFoundException e)
	{
	e.printStackTrace();
	}
	return conn;
	}

	public static Properties loadProperties() {
	// TODO Auto-generated method stub
	InputStream propsFile;
	Properties dbProperties=new Properties();
	try
	{
	propsFile=new FileInputStream(PROPERTIES_FILE_NAME);
	dbProperties.load(propsFile);
	propsFile.close();
	}
	catch(IOException e)
	{
	System.out.println("I/O Exception");
	e.printStackTrace();
	System.exit(0);
	}
	return dbProperties;
	}

	}


