package Lec19;

public class count_of_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 321;
System.out.println(count(n));
	}
public static int count(int n) {
	int count = 0;
	while(n>0) {
		count++;
		n = n/10;
	}
	return count;
}
}
