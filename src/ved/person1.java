package ved;

import java.util.Scanner;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Period;

enum G1{m,f};
public class person1 {
String firstName;
String lastName;
//char gender;
//long phn;
public String getFullName(String firstName,String lastName) {
this.firstName=firstName;
this.lastName=lastName;
return firstName+lastName;
}
public int calculateAge(LocalDate d1) {
LocalDate d2=LocalDate.now();
Period diff=Period.between(d1,d2);
int x=diff.getYears();
return x;
}
/*public String getFirstName() {
return firstName;
}
public void setFirstName(String firstName) {
this.firstName = firstName;
}
public String getLastName() {
return lastName;
}
public void setLastName(String lastName) {
this.lastName = lastName;
}
/*public char getGender() {
return gender;
}
public void setGender(char gender) {
this.gender = gender;
}*/
public long phoneNumber() {
Scanner sc=new Scanner(System.in);
System.out.println("enter phone number");
long y=sc.nextLong();
return y;

}
/*Person(){
this.firstName=firstName;
this.lastName=lastName;
//this.gender=gender;

}
Person(String firstName,String lastName,byte gender,long phn){
this.firstName=firstName;
this.lastName=lastName;
//this.gender=gender;
}*/
}

