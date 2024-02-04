package Lec24;

public class String_initialiaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char[] a = {'a','b'};
String s = new String(a);
System.out.println(s);
//String Buffer
StringBuffer sb = new StringBuffer("hello");
String str = new String(sb);
System.out.println(str);
	}

}
