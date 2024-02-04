package Lec13;
class Author{
	private String name;
	private String email;
	Author(String name,String email){
		this.name = name;
		this.email = email;
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
	public String toString() {
		return name;
	}
	
}
public class Author1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author a = new Author("Mayank","Mayank@gmail.com");
		System.out.println(a);

	}

}
