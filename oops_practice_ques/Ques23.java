package oops_practice_ques;

public class Ques23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 12345;
int se = 0;
int so = 0;
while(n>0) {
	int rem = n%10;
	if(rem%2==0) {
		se+=rem;
	}
	else {
		so+=rem;
	} 
	n= n/10;   
}
if(se%4==0 || so%3==0) {
	System.out.println("Yes");
}
else {
	System.out.println("No");
}
	}

}
