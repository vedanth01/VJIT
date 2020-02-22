class Car
{
 private String color; 
 private int maxSpeed;
	public Car() {
		super();
		
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	@Override
	public String toString() {
		return "Car [color=" + color + ", maxSpeed=" + maxSpeed + "]";
	}

}

class Maruthi extends Car
{
 void marutiStartDemo()
 {
	 Engine e=new Engine();
	 e.start();
	
 }

@Override
public String toString() {
	return super.toString();
}
 

}

class Engine
{
	 void start()
	 {
		 System.out.println("engine started");
	 }
	 
	 void stop()
	 {
		 System.out.println("engine stopped");
	 }
 	

}



public class Aa3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Car c=new Car();
  
  Maruthi m=new Maruthi();
 
  m.setColor("yellow");
  m.setMaxSpeed(50);
  
  System.out.println(m);
  m.marutiStartDemo();
	}

}
