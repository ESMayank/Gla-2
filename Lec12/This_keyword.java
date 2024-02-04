package Lec12;
class salary{
	int salary;
	void Setsalary(int salary) {
//		salary = salary+salary; both variables are local
		this.salary = this.salary + salary;//this gives reference of that class to local variable
	}
}
public class This_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		this.name;//u can't use this in static area
		salary s = new salary();
		s.Setsalary(500);
		System.out.println(s.salary);//null

	}

}
