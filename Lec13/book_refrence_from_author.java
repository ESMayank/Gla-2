package Lec13;
class book{
	String book;
	Author a = new Author("Mayank","Mayank@gmail.com");
	int qntStock;
	Author name = a;
	book(String book,int qnt,Author a){
		this.book = book;
		this.qntStock = qnt;
		this.name = a;
	}
	public String toString() {
		return book+" "+qntStock+" "+name;
	}
}
public class book_refrence_from_author {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author a = new Author("Mayank","Mayank@gmail.com");
      book b = new book("Maynk",3,a);
      System.out.println(b);
      
	}

}
