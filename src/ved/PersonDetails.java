package ved;

import java.util.Scanner;

public class PersonDetails {

	String firstName;
	String lastName;
	char gender;
	short age;
	double weight;

	public static void main(String[] args) 
	{
		PersonDetails p = new PersonDetails();
		Scanner sc=new Scanner(System.in);
	
		System.out.println("First Name :");
		String firstName = sc.nextLine();
	
		System.out.println("First Name :");
		String lastName = sc.nextLine();
	
		System.out.println("Gender :");
		char gender = sc.nextLine().charAt(0);
		
		System.out.println("Age :");
		short age = sc.nextShort();
	
		System.out.println("Weight :");
		double weight = sc.nextDouble();
	
		System.out.println("First Name : "+ firstName);
		System.out.println("Last Name : "+ lastName);
		System.out.println("Gender : "+ gender);
		System.out.println("Age : "+ age);
		System.out.println("Weight : "+ weight);
	
		sc.close();
	}
}
