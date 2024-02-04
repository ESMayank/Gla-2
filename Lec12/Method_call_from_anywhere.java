package Lec12;

public class Method_call_from_anywhere {
void name() {
	name();//fxn can call also in itself ;
}
//name();//you can't call in the class only call method in other method and itself 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_call_from_anywhere m1 = new Method_call_from_anywhere();
		m1.name();//u can call also from in main method its means method we call from anywhere but only in method

	}

}
