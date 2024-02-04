package Lec5;

public class Comparison_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println(12>10>3);it gives error;
		System.out.println(12 >= 12.0);
//System.out.println(true>false);
//System.out.println("A">"C");//gives error
		System.out.println('a' > 'c');
		System.out.println(true == false);
		System.out.println('0' == 48);// true
		String s1 = "hello";
		String s2 = "hello";
		String s3 = new String("hello");
		System.out.println(s1==s2);//true
		System.out.println(s1==s3);//false due to scp(spring core pool);

	}

}
