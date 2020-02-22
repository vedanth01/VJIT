package multithreading;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
public class CopyDataThread extends Thread 
{
	public void run()
	{try
	{

		
		Thread.sleep(1000);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
	
	public static void main(String args[])
	{
		CopyDataThread cd=new CopyDataThread();	
		int c;
		try{
		FileReader fr=new FileReader("D:/Myworkspace/multithreading/source.txt");
		ArrayList<Character> al=new ArrayList<Character>();
		FileWriter fw=new FileWriter("D:/Myworkspace/multithreading/destination.txt");
		Scanner sc=new Scanner(System.in);
		
	System.out.println(al);
		fr.close();
		fw.close();
		while(( c = fr.read()) != -1)

		{

		char character = (char) c;

		System.out.println(character);
		fw.write(character);

		}
	
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
}

