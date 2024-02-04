package Lec22;

public class intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a = {1,2,3,4,5};
int []b = {2,3,6,7,4,1};
int []new_arr = intersection(a,b);
for (int i = 0; i < new_arr.length; i++) {
	System.out.print(new_arr[i]+" ");
}
	}
public static int sum(int []a,int[] b) {
	int count = 0;
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < b.length; j++) {
			if(a[i]==b[j]) {
				count++;
			}
		}
	}
	return count;
}
public static int[] intersection(int []a,int []b) {
	int []inter = new int[sum(a,b)];
	int pos = 0;
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < b.length; j++) {
			if(a[i]==b[j]) {
				inter[pos] = a[i];
				pos++;
			}
		}
	}
	return inter;
}
}
