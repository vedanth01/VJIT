class Author
{
 private String name,email;
 private char gen;
 
	public Author(String name, String email, char gen) {
	super();
	this.name = name;
	this.email = email;
	this.gen = gen;
}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGen() {
		return gen;
	}
	public void setGen(char gen) {
		this.gen = gen;
	}
	
	@Override
	public String toString() {
		return "Author [name=" + name + ", email=" + email + ", gen=" + gen + "]";
	}
	
	

}



class Book
{
 private String name; private double price; 
 private int qty; private Author author;

		
		public Book(String name, double price, Author author) {
			super();
			this.name = name;
			this.price = price;
			this.author = author;
		}
		
		
		public Book(String name, double price, int qty, Author author) {
			super();
			this.name = name;
			this.price = price;
			this.qty = qty;
			this.author = author;
		}
		
		
		public String getName() {
			return name;
		}
		
		
		public void setName(String name) {
			this.name = name;
		}
		
		
		public double getPrice() {
			return price;
		}
		
		
		public void setPrice(double price) {
			this.price = price;
		}
		
		
		public int getQty() {
			return qty;
		}
		
		
		public void setQty(int qty) {
			this.qty = qty;
		}
		
		
		public Author getAuthor() {
			return author;
		}
		
		
		public void setAuthor(Author author) {
			this.author = author;
		}
		
		
		@Override
		public String toString() {
			return "Book [name=" + name + ", price=" + price + ", qty=" + qty + ", author=" + author + "]";
		}
 
  
}



public class Aa4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Author a=new Author("herbert schildt","herbert@gmail.com",'m');
  Book b=new Book("java",350.5,5,a);
  System.out.println(b);
	}

}
