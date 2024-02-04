package oops_practice_ques;

public class Ques17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 45367;
int sum = 0;
int digit = digit(n);
int i = 1;
while(n>0) {
	int rem = n%10;
	sum += rem*Math.pow(10, digit-i);
	i++;
	n = n/10;
}
System.out.println(sum);
	} 
public static int digit(int n) {
	int count = 0;
	while(n>0) {
		count++;
		n=n/10;
	}
	return count;
}
}
