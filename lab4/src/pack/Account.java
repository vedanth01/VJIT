package pack;

import java.util.*;
public class Account extends PersonIn {
private  long  accNum=101;
 private double balance;

public long getAccNum() {
	return accNum;
}
public void setAccNum(long accNum) {
	accNum+=1;
	this.accNum = accNum;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public void deposit(double damount)
{
	balance=damount+balance;
	setBalance(balance);
}
public void withdraw(double amount)
{

	balance=balance - amount;
	setBalance(balance);


}
public String toString()
{
	return getName()+" "+getAge()+" "+getAccNum()+" "+getBalance();
}
public static void main(String a[])
{
	Scanner sc=new Scanner (System.in);
	
	System.out.println("name and deposit amount and age");
	
	String name=sc.nextLine();
	double amount=sc.nextDouble();
	int age=sc.nextInt();
	
	Account a1=new Account();
	
	a1.setName(name);
	a1.setBalance(amount);
	a1.setAge(age);
	a1.setAccNum(a1.accNum);
	
	System.out.println("next name and amount and age");
	String name1=sc.next();
	double amount1=sc.nextDouble();
	
	Account a2=new Account();
	a2.setName(name1);
	int age1=sc.nextInt();

	a2.setAccNum(a1.accNum);
	a2.setBalance(amount1);
	a2.setAge(age1);
	System.out.println("deposit 2000 in acc1....so enter 2k");
	double amount2=sc.nextDouble();
	a1.deposit(amount2);
	
	System.out.println("withdraw 2k from acc2");
	double amount3=sc.nextDouble();
	a2.withdraw(amount3);
	
	System.out.println("balance in "+a1.getName()+ "account is "+a1.getBalance());
	System.out.println("balance in " +a2.getName() +"account is "+a2.getBalance());
	System.out.println(a1.toString());
	System.out.println(a2.toString());
}
}
