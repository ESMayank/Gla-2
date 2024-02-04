package Lec19;

public class Place_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 10101;
System.out.println(placevalue(n));
	}
public static int placevalue(int n) {
	int sum = 10;
	int digit = count(n)-1;
	return (int)(Math.pow(sum, digit));
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
