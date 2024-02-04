package Lec9;
class Employee {

	String empName;
	String empId;
	
}
public class Object_reference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1;
		Employee e2;

		e1 = new Employee();

		e2 = e1;//its makes e1 have a reference value and now e1 and e2 points same address

		e1.empId = "1001";
		e1.empName = "ram prasad bismil";

		e2.empId = "22222";
		e2.empName = "subhash chandra bose";//overwrite the values of e1 also because of same reference address

		System.out.println("name -> " + e1.empName + " , ID -> " + e1.empId);
		System.out.println("name -> " + e2.empName + " , ID -> " + e2.empId);

		System.out.println(e1.hashCode());//1151593579
		System.out.println(e2.hashCode());//1151593579 both gives same address because e2 holds e1 reference address
		
	}

}
