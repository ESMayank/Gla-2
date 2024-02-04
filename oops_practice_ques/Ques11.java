package oops_practice_ques;

public class Ques11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "aabbcc";
String ans = "";
//first Approach O(n)
char prev = str.charAt(0);
for (int i = 1; i < str.length(); i++) {
	char curr = str.charAt(i);                            
	if(prev!=curr) {
		ans+=prev;
		prev = curr;
	}        
}           
ans+=prev;
//Second Approach O(n)                                                              
for (int i = 0; i < str.length();) {    
	int count = 1;       
	while(i+count<str.length() && str.charAt(i)==str.charAt(count+i)) {
		count++;
	}
	ans+=str.charAt(i);
	i = i+count;
}
System.out.println(ans);
	}
}
