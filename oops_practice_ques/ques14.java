package oops_practice_ques;

public class ques14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String ques = "1010101010111111";
int ans = 0;
for (int i = 0; i < ques.length(); ) {
	int count = 1;
	while(i+count<ques.length() && ques.charAt(i)==ques.charAt(i+count)) {
		count++;
	}             
	if(count>=7) {
		ans = count;
	}
	i = i+count;
}
if(ans>=7) {
	System.out.println("Dangerous");
}
else {
	System.out.println("Not");
	
}
	}

}
