package ved;

import ved.Person;

public class PersonMain 
{
	public static void main(String args[]) {
		Person p=new Person();
		System.out.println("person details");
		System.out.println("----------------");
		System.out.println("firstName:"+p.getFirstName());
		System.out.println("lastName:"+p.getLastName());
		//System.out.println("gender:"+p.getGender());
		Gender g=Gender.m;
		System.out.println("gender:"+g);
		
		System.out.println("phone number:"+p.phoneNumber());
		System.out.println("person details");
		System.out.println("----------------");
		long phn=0;
		Person p1=new Person("sid","gaddam",/*'m',*/phn);
		System.out.println("firstName:"+p1.firstName);
		System.out.println("lastName:"+p1.lastName);
		////System.out.println("gender:"+p1.gender);
		phn=p1.phoneNumber();
		System.out.println(phn);


	}
}
