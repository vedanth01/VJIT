package ved;

import java.text.*;
import java.util.*;

public class p3 {
	public static void main(String args[])
	{

		Date d1=new Date();
		SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy");
		String s1=sd.format(d1);
		System.out.println("british:"+s1+"\n"); 
		SimpleDateFormat sd1=new SimpleDateFormat("dd.MM.yyyy");
		String s2=sd1.format(d1);
		System.out.println("japanese:"+s2+"\n"); 
		SimpleDateFormat sd2=new SimpleDateFormat("MM/dd/yyyy");
		String s3=sd2.format(d1);
		System.out.println("american:"+s3+"\n"); 
}
}
