package Lec22;

public class Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a = {1,2,3,4,5};
int []b = {6,7,8,9,10};
int []merge = merge(a,b);
for (int i = 0; i < merge.length; i++) {
	System.out.print(merge[i]+" ");
}
	}
public static int[] merge(int []a,int []b) {
	int []merge = new int[a.length+b.length];
	for (int i = 0; i < a.length; i++) {
		merge[i] = a[i];
	}
	for (int i = 0; i < b.length; i++) {
		merge[a.length+i] = b[i];
	}
	return merge;
}
}
