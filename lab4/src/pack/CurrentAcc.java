package pack;

import java.util.*;
public class CurrentAcc extends Account{
 double odlimit=-1000;
 
 @Override
 
	public void withdraw(double amount1) {
		amount1=getBalance()-amount1;
	if(amount1<0 && amount1>=odlimit)
	{
			System.out.println("amount to be paid later "+amount1);
	}
	else if(amount1<0 && amount1<odlimit)
		System.out.println("over draft limit exceeded");
	else
		System.out.println("rem bal:"+amount1);
	}
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
CurrentAcc c1=new CurrentAcc();
System.out.println("enter amount you want to deposit ");
double amount=sc.nextDouble();
c1.setBalance(amount);
System.out.println("available balance="+c1.getBalance());
System.out.println("enter amount you want to withdraw ");
double amount1=sc.nextDouble();
c1.withdraw(amount1);


	}

}
