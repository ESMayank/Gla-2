package Lec10;

public class Static_Variable_2 {
	static float var_1 = 23.90f;
	double var_2 = 555.00;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Static_Variable_2.var_1);
Static_Variable_2 s1 = new Static_Variable_2();
//System.out.println(Static_Variable_2.var_2);//if i want to use var_2 i initialize main class object
System.out.println(s1.var_2);//555.00
	}

}
