package Lec19;

public class rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 121;
System.out.println(reverse(n));
System.out.println(reverse(n)== n);
	}
public static int reverse(int n) { 
	int sum = 0;
	while(n>0) {
		int rem = n%10;
		sum = sum*10+rem;
		n = n/10;
	}
	return sum;
}

}
