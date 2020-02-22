package ved;



public class Employee_ 
{
	private String name;
	private float sal;
	private String designation;
	private String insur;

	Employee_(){}
	
	Employee_(String name, float sal, String designation, String insur)
	{
		this.name = name;
		this.designation = designation;
		this.sal = sal;
		this.insur=insur;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsur() {
		return insur;
	}
	public void setInsur(String insur) {
		this.insur = insur;
	}
}