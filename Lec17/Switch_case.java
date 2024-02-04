package Lec17;

public class Switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x = 10;
//switch(x) {//must be one case or default to run
//System.out.print("hello");
//}
//switch(x) {
//case 10: System.out.println("Hello");
//}
final int y = 20;
//switch(x) {
//case 10:
//	System.out.println("10");
//case y://value should be constant
//	System.out.println("20");
//}
//switch(x) {
//case 10:
//	System.out.println("10");
//case y://value should be constant
//	System.out.println("20");
//}
//switch(x+1) {
//case 10:
//case 10+20:
//case 10+20+30:
//}
byte b = 10;
//switch(b) {
//case 10:
//	System.out.println("10");
//case 100:
//	System.out.println("100");
//case 1000://range of byte is only for +127
//	System.out.println("1000");
//}
switch(b+1) {
default:
	System.out.println("default");
case 10:
	System.out.println("10");
case 12:
	System.out.println("100");
case 1000:
	System.out.println("1000");
}
}

}
