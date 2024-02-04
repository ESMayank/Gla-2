package oops_practice_ques;
import java.util.*;
public class Ques26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
float tb = sc.nextFloat();
int x = sc.nextInt();

if(x%5==0 && tb-x>0) {
	tb = tb - x - 0.5f;
}
System.out.println(tb+"0");
sc.close();
	}
}
