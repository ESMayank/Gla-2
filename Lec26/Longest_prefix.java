package Lec26;



public class Longest_prefix {
public static void main(String[] args) {
	String []str = {"flow","flown","flight"};
	System.out.println(Longest(str));
}
public static String Longest(String []str) {
	
	String s = str[0];
	String ans = "";
	boolean b = true;
	for (int i = 0; i < s.length(); i++) {
		char c = s.charAt(i);
		for (int j = 1; j < str.length; j++) {
			char c1 = str[j].charAt(i);
			if(c!=c1) {
				b = false;
				break;
			}
		
		}
		if(!b) {
			break;
		}
		ans+=c;
	}
	return ans;

}
}

