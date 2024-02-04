package oops_practice_ques;
import java.util.*;
public class Ques25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int sum = 0;
while(true) {
	int x = sc.nextInt();
	sum+=x;
	if(sum<0) {
		break;
	}
	System.out.println(x);
}
sc.close();
	}

}
