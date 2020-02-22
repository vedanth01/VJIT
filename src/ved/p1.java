package ved;

class v1 {
public int x;
String s;
private float y;
protected double z;
public void m1()
{
	System.out.println("hi");
	
}
private void m2()
{
	System.out.println("hello");
}
protected void m3()
{
	System.out.println("he");
}

}
class p1
{public static void main(String args[])
	{
	v1 k=new v1();
	System.out.println(k.x+"\n");

	System.out.println(k.z+"\n");
	System.out.println(k.s+"\n");
	k.m1();

	k.m3();

	
	}
}
