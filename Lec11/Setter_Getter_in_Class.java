package Lec11;
class Employee{
	private String name;//u can't access this in another class so you have to make setter getter methods
	private int id;
	//for name
	 void setEmployeeName(String n) {
		name = n;
		
	}
	 void getEmployeeName() {
		 System.out.println(name);
	 }
	 //for id
	 void setEmployeeid(int i) {
			id = i;
			
		}
		 void getEmployeeid() {
			 System.out.println(id);
		 }
}
public class Setter_Getter_in_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.setEmployeeName("Mayank");//make their employee name is Mayank
		e.getEmployeeName();//get the details of name 
		e.setEmployeeid(123);//set the id of Employee
		e.getEmployeeid();//give the details of employee id 

	}

}
