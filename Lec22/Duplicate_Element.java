package Lec22;
import java.util.Arrays;             
public class Duplicate_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {1,1,2,3,3,5,5,5,4,0};
		int []new_arr = set(arr);
		for (int i = 0; i < new_arr.length; i++) {
			System.out.print(new_arr[i]+" ");
		}
	}
	public static int extra(int []a) {
		int count = 0;
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j]) {
					count++;
					break;
					    
				}
			}
		}
		return count;
	}
	public static int[] set(int []a) {
		int []new_arr = new int[a.length-extra(a)];
		int pos = 0;
		
		for (int i = 0; i < a.length; i++) {
			if(search(new_arr,a[i])==false) {
				new_arr[pos] = a[i];
				pos++;
			}
		}
		Arrays.sort(new_arr);
		return new_arr;
	}
	public static boolean search(int []a,int target) {
		for (int i = 0; i < a.length; i++) {
			if(a[i]==target) {   
				return true;
			}
		}
		return false;
	}
}
