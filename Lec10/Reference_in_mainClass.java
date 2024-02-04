package Lec10;

public class Reference_in_mainClass {
	Employee e1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reference_in_mainClass t1 = new Reference_in_mainClass();
		System.out.println(t1.e1.empName);//error java.lang.NullPointerException
	}

}
