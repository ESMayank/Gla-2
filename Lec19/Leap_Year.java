package Lec19;

public class Leap_Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int year = 1200;
System.out.println(leap(year));
	}
public static boolean leap(int y) {
	if(y%400==0 || y%4==0&&y%100!=0) {
		return true;
	}
	return false;
}
}
