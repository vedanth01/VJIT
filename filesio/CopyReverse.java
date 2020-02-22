package filesio;
import java.io.*;
import java.util.*;
public class CopyReverse {

	public static void main(String[] args) {
		try
		{
		//	File f=new File("/D:/java capgemini/abc.txt");
			FileReader fr=new FileReader("/D:/Myworkspace/filesio/v2.txt");
			ArrayList<Character> al=new ArrayList<Character>();
			FileWriter fw=new FileWriter("/D:/Myworkspace/filesio/out.txt");
			int c;
			while((c=fr.read())!=-1)
			{
			al.add((char)c);
			}
			Collections.reverse(al);
			for(int i: al)
			{
				//System.out.println((char)i);
				fw.write(i);
			}
		//System.out.println(al);
			fr.close();
			fw.close();
		}
		catch(Exception e)
		{
			System.out.println("no file "+e);
		}
	}

}
