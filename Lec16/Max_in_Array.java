package Lec16;

public class Max_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr = {1,2,3,4,5,6,7};
System.out.println(max(arr));
	}
public static int max(int []a) {
	int max = a[0];
	for (int i = 1; i < a.length; i++) {
		if(max<a[i]) {
			max = a[i];
		}
	}
	return max;
}
}
