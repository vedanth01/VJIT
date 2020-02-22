import java.util.Scanner;
interface bill {
double per_unit=5.0;
double calculate(int nou);
}
class electricbill implements bill{
	public double calculate(int nou){
		return per_unit*nou;
	}
}
	class waterbill implements bill{
		public double calculate(int nou){
			return per_unit*nou;
		}
		
}
public class interpaseex1{
	public static void main(String args[])
	{Scanner sc=new Scanner(System.in);
	System.out.println("enter choice:");
	System.out.println("1:electricitybill");
	System.out.println("2:waterbill");
	int ch=sc.nextInt();
		switch(ch)
		{
			case 1:System.out.println("electricitybill");
				electricbill e=new electricbill();
				System.out.println("enter value:\n");
				int k=sc.nextInt();
			double x=e.calculate(k);
			System.out.println(x);
			break;
			case 2:
				System.out.println("waterbill");
				waterbill w=new waterbill();
				System.out.println("enter value:\n");
				int p=sc.nextInt();
			double y=w.calculate(p);
			System.out.println(y);
		break;
	}

	}
		
}
