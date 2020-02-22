package vedanth;

import java.util.Scanner;

class Employee {
	private int id;
	private String name;
	private double salary;
	private static int idinc = 1000;

	Employee() {

	}

	Employee(String n, double s) {
		name = n;
		id = idinc++;
		salary = s;
	}

	public void display() {
		System.out.println(id + " " + name + " " + salary);
	}

	/*
	 * public void setSalary(double s)
	 * { salary=s; }
	 *  public double getSalary(){
	 * return salary; }
	 *  public void setId(int i)
	 *  { id=i; } 
	 *  public void setName(String n) { name=n; }
	 */

}

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		String name = sc.next();
		double salary = sc.nextDouble();
		Employee emp = new Employee(name, salary);
		emp.display();
	}
}
