package Lec10;
class Employee{
	String empName;
	String empId;
	public String toString() {//this helps to print values from object now i interchange the default printing by using this
		return empName+" "+empId;
	}
}
public class To_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Employee e1 = new Employee();
      System.out.println(e1);
	}

}
