package ved;



import java.util.*;

public class hash extends Employee_ 
{
	public static void main(String args[])
	{
		  Map<String, Employee_> h = new HashMap<String, Employee_>();

		  Employee_ employee1 = new Employee_();
		  employee1.setName("bharath");
		  employee1.setDesignation("Developer");
		  employee1.setSal(10000.50f);
		  employee1.setInsur("lic");
		  
		  Employee_ employee2 = new Employee_();
		  employee2.setName("shashi");
		  employee2.setDesignation("Developer");
		  employee2.setSal(10000.70f);
		  employee2.setInsur("arogya");
		  
	  h.put("bharath", employee1 );
     h.put("shashi", employee2);
	  
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter Insurance Scheme : ");
		  String s = sc.next();

		  if(s.equalsIgnoreCase("lic")) {
			  Set set = h.entrySet();
			  Iterator it = set.iterator();
			  while(it.hasNext())
			  {	  
				  Map.Entry me = (Map.Entry) it.next();
				  if(me.getValue().equals(employee1))
				  {
					  Employee_ emp = (Employee_) me.getValue();
					  if(s.equalsIgnoreCase(emp.getInsur()))
					  {
             	  
				  System.out.println(me.getKey() + " : " + emp.getSal());
			  }
					  }
				  else if(me.getValue().equals(employee2))
				  {
					  Employee_ emp = (Employee_) me.getValue();
					  if(s.equalsIgnoreCase(emp.getInsur()))
					  {
             	  
				  System.out.println(me.getKey() + " : " + emp.getSal());
			  }
					  }			  
				  }
		  }
	}
}
