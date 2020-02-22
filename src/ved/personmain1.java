package ved;

import java.time.LocalDate;

import ved.person1;

public class personmain1
{
public static void main(String args[]) {
person1 p=new person1();
LocalDate d1=LocalDate.of(1998, 04, 02);
//System.out.println("person details");
System.out.println("----------------");
//System.out.println("firstName:"+p.getFirstName());
//System.out.println("lastName:"+p.getLastName());
//System.out.println("gender:"+p.getGender());
//System.out.println("gender:");
//Gender g=Gender.m;
//System.out.println("gender"+g);


//System.out.println("phone number:"+p.phoneNumber());
//System.out.println("person details");
//System.out.println("----------------");
//long phn=0;
/*Person p1=new Person("sid","gaddam",/*'m',phn);
System.out.println("firstName:"+p1.firstName);
System.out.println("lastName:"+p1.lastName);
System.out.println("gender:"+p1.gender);
phn=p1.phoneNumber();
System.out.println(phn);*/
int x=p.calculateAge(d1);
System.out.println("age is"+x);
System.out.println("full name is"+p.getFullName("vedanth", "gupta"));


}
}
