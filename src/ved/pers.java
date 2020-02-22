package ved;

import java.util.Scanner;
enum Gender1{m,f};
public class pers {
String firstName="hemanth";
String lastName="reddy";
//char gender='m';
long phn;
public String getFirstName() {
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
pers(){
	this.firstName=firstName;
	this.lastName=lastName;
	//this.gender=gender;
	
}
pers(String firstName,String lastName,/*byte gender,*/long phn){
	this.firstName=firstName;
	this.lastName=lastName;
	//this.gender=gender;
}
}
