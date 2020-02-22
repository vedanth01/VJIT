
 class Cake
 {
	 private String shape,flavour;
	 private int qty;
	 private float price=400;
	public Cake(String shape, String flavour, int qty) {
		super();
		this.shape = shape;
		this.flavour = flavour;
		this.qty = qty;
		price=price*qty;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public String getFlavour() {
		return flavour;
	}
	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	 
	
	@Override
	public String toString() {
		return "A " + shape+" " + flavour + " cake of  qty " + qty + "kg/kg is Ready @ Rs." + price + "/-";
	}
	
	protected void showCake()
	{
		System.out.println("A "+shape+" "+flavour+ " Cake Of "+qty+"Kg/Kg's Ready @ Rs."+price+"/-");
		
	}	 
	 
	 
 }
 class OrderedCake extends Cake
 {
	 private String msg;

	public OrderedCake(String shape, String flavour, int qty) {
		super(shape, flavour, qty);
	}

	public OrderedCake(String shape, String flavour, int qty, String msg) {
		super(shape, flavour, qty);
		this.msg = msg;
	}
	
	
	

	

	public void showCake()
	{ 
		
		if(msg!=null)
		//super.showCake();
			System.out.println(super.toString()+" with message "+msg);
	  else
		super.showCake();
	}	 
	 
	 
	 
 }
 
public class Aa5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //Cake c=new Cake("round","venilla",1);
  // WITH MESSAGE
  System.out.println(" WITH MESSAGE  ");
  OrderedCake ca=new OrderedCake("round","venilla",2,"HAPPY BIRTHDAY!!");
  //ca.setQty(2);
  ca.showCake();
  
  System.out.println(" WITHOUT MESSAGE  ");
 // WITHOUT MESSAGE
  OrderedCake oc=new OrderedCake("round","venilla",1);
  
  
  oc.showCake();
	}

}
