
public class Author {
 private static String name;
 private static String email;
 private static char gender;
 public Author(String email,String name,char gender) {
	 this.email=email;
	 this.gender=gender;
	 this.name=name;
	// TODO Auto-generated constructor stub
}
 
	
public String toString() {
	return  name + " ( "+ gender +" ) " +"at "+ email ;
}

	public static String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public static String getName() {
	return name;
}

public static char getGender() {
	return gender;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Author play= new Author("kjay@gogo.com", "one and only",'m');
	System.out.println(play.toString());
	Book hmm= new Book("hmmm", play, 0500, 50);
     System.out.println(hmm.toString());
	}
	

}
class Book{
	
	String name;
	Author author;
	double price;
	int qty;
public Book(String name,Author author,double price, int qty) {
	this.author=author;
	this.name=name;
	this.price=price;
	this.qty=qty;
	// TODO Auto-generated constructor stub
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
public String getName() {
	return name;
}
public Author getAuthor() {
	return author;
}
@Override
public String toString() {
	return  name +" by "+ Author.getName() + " ( "+ Author.getGender() +" ) " +"at "+ Author.getEmail() ;
}	
	
}