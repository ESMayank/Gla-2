package Lec11;

public class fun_demo_2 {
	//return types of methods
void name() {//void never return any value
	System.out.println("Mayank");
}
int age() {//integer method only return integer value
	int age = 18;
	return age;//return keyword use to return a value from the method
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun_demo_2 f = new fun_demo_2();//creating a object cause method is non-static
		f.name();//Mayank
		System.out.println(f.age());//print this thing cause f.age() store value and we have to print this
	}

}
