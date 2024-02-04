package Lec24;

public class String_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "University";
byte b = 3;
char c = s.charAt(b);//return char at that index
String s2 = "GLA";
System.out.println(s2.concat(s));//GLAUniversity
System.out.println(s2);//GLA
//equals === object class method not string ..string inherit this method generally in object it checks hash but string overwrite this method
System.out.println(s.equals(s2)); 
System.out.println(s2.equalsIgnoreCase(s));//ignore the cases of value(upper and lower)
System.out.println(s.substring(0,3));//Uni  
System.out.println(s.replace('U', 'O'));//Oniversity its replace U to I
String str = "  Hello   ";
System.out.println(str.trim());//removes the space from beginning and End --> Hello
System.out.println(str.indexOf('H'));//return the index of particular char from the String
System.out.println(str.lastIndexOf('l'));//return the last index of repeat char
String s1 = "bhaskar";
String s6 = s1.toLowerCase();
System.out.println(s1==s6);//true cause there is no change in s1
String s7 = s6.intern();
System.out.println(s7==s6);//true intern copy the address of s6 but only for sp(string pool)
System.out.println(s1.compareTo("bhaskar"));//0

	}

}
