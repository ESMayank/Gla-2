package oops_practice_ques;

public class Ques13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String ques = "GLA";
String ans = "";
if(ques.charAt(0)>=97 && ques.charAt(0)<=122 ) {
	ans+=(char)(ques.charAt(0)-32);
}
else {
ans+=(char)(ques.charAt(0));
}
for (int i = 1; i < ques.length(); i++) {
	ans+=(char)(ques.charAt(i));
}
System.out.println(ans);
	}

}
