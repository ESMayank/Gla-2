package oops_practice_ques;

public class Ques16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 333333;
int target = 3;
int count = 0;
while(n>0) {
	int rem = n%10;
	if(rem==target) {
		count++;
	}
	n = n/10;
}                                           
System.out.println(count);
	}
}
