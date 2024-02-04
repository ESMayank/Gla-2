package Lec6;

public class Implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int x = 4;
//		int y = ++4;// gives error due to 4 is a constant
//		System.out.println(y);
//		int x = 4;
//		int y = ++(++x) ++x = 5 and 5 treat as a constant that's why it gives error
//		final int x = 5;
//		x++; gives error because x is constant due to final keyword
//		System.out.println(x);
		char c = 'A';
		double d = 123.90;
		System.out.print("Value of C and D is : " + c + " , " + d);// A,123.90
//        byte b1 = 10;
//	    byte b2 = 10;
//	    byte b = b1+b2;//it returns integer but the variable type is byte that's why it shows incompatible type error
//        System.out.print("Value of b is:"+b);
		short b = 'A' + 'B';
		System.out.print("Value of b is:" + b);// 131
//        char a = 'A';
//	    short b = a+'B';//shows error because a is a variable not a constant
//        System.out.print("Value of b is:"+b);
//        final  char a = 'A';

//	    short b = (a+'B');
//            System.out.print("Value of b is:"+b);//131
//        -----  _var = 'a'+2.20;//Double
//	    
//        System.out.print("Value of _var is:"+_var);
//        String a="ISRO";
//		int b=10,c=20,d=30;
//		System.out.println(a+b+c+d);//ISRO102030
//		System.out.println(b+c+d+a);//60ISRO
//		System.out.println(b+c+a+d);//30ISRO30
//		System.out.println(b+a+c+d);//10ISRO50
//        String a="ISRO";
//   		int b=10,c=20,d=30;
//   		a = a+b+c;
//   		c = b+d;
//   		c = a+b+d;//it shows error due to incompatible type because string cannot convert into integer
//   		System.out.println(a);
//        int x = 10;
//	       int y = 10;
//	       int z = 10;
//		x = x++;
//		y = ++y;
//		z = --z;
//	    System.out.println(x+" , "+y+" , "+z);//x:10,y:11,z:9
//        System.out.println(100>200>300);//100>200 = False and then False>300 so it shows error because boolean cannot be compared
		System.out.println(10 > 10.5);// false
		System.out.println('a' > 95.5);// true
		System.out.println('z' > 'a');// true
//	    System.out.println(true>false);//shows error due to comparison of boolean
//	    System.out.println("java">"python");//error string cannot be compared
		System.out.println(10 == 10.0);// true
		System.out.println('a' == 97.0);// true
		System.out.println(true == true);// true
		System.out.println('a' != 'b');// true
		String s1=new String("GLA");
		String s2=new String("GLA");
		System.out.println(s1==s2);//False due to different address in the heap memory
		System.out.println(s1.equals(s2));	//True because it check only value of both string not address
		byte x = 10>20 ? 100:110;
		System.out.println(x);	 //110 
//		final int a = 10;
//		final int b = 20;		
//		byte x = a>b ? 100:110;
//		System.out.println(x);//110
		 

	}

}
