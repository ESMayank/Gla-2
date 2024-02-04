package oops_practice_ques;

public class Ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "University";
for (int i = 0; i < str.length(); i++) {
	if(isvowel(str.charAt(i))){
		System.out.print(i+" ");
	}
}
	}
public static boolean isvowel(char c) {
	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
		return true;
	}
	return false;
}
}
