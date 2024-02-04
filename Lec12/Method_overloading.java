package Lec12;

public class Method_overloading {
void name() {
	System.out.println("no arguments");
}
void name(int n) {//you can make multiple methods in java with same name this is called method overloading
	System.out.println("int args");
}
void name(float n) {
	System.out.println("float args");
}
//int name() {//but u cant change their return type only params u can change
//	
//}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_overloading m1 = new Method_overloading();
		m1.name();//no args
		m1.name(1);//int args
		m1.name(1.0f);//float args

	}

}
