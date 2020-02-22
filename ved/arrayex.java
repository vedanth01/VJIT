package ved;
//import java.lang.reflect.Array;
import java.util.*;
public class arrayex {
public static void main(String args[])
{
	ArrayList<String> arr = new ArrayList<String>(); 
	arr.add("ved");
	arr.add("hem");
	arr.add("sid");
	arr.add("sam");
     Collections.sort(arr);
     for(String ele:arr)
     {
    	 System.out.println(ele);
     }
}
}
