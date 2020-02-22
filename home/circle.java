package home;
import java.util.Scanner;
class pjt1 {

	
	private Double radius=1.0,pi=3.14;
	pjt1()
	{
		
	}
	pjt1(Double r)
	{
		radius=r;
	}
	
	public double getRadius()
	{
		return radius;
	}
	public double getArea()
	{
		return pi*radius*radius;
	}
	/*public void display()
	{
		System.out.println(pi*radius*radius);
	}*/
}
public class circle{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		double radius=sc.nextDouble();
		sc.close();
		System.out.println("enter radious:");
		
		pjt1 x=new pjt1(radius);
		x.getArea();
		
	}
}