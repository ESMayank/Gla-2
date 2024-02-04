package Lec12;
class Employee{
	private int salary;
	Employee(){
		System.out.println("without params");
	}
	Employee(int x){
		System.out.println("int");
	};
	void setSalary(int n) {
		salary += n;
	}
//	private void setSalary(int n) {
//		salary += n;
//	}
	void getSalary() {
		System.out.println(this.salary);
	}
}
public class Access_Modifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.setSalary(100);
//		e1.Salary;//can't use private variable only use in their class
		e1.getSalary();
	}

}
