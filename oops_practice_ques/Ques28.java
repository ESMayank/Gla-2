package oops_practice_ques;

public class Ques28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr = {0,1,1,0,1,0,1,0,0};
int i = 0;
int j = arr.length-1;
while(i<=j) {
	if(arr[i]==0 && arr[j]==1) {
		i++;
		j--;
	}
	else if(arr[i]==1 && arr[j]==0) {
		swap(arr,i,j);
	}
	else if(arr[i]==0) {
		i++;
	}
	else if(arr[j]==1) {
		j--;
	}
}
for (int j2 = 0; j2 < arr.length; j2++) {
	System.out.print(arr[j2]+" ");
}
	}
public static void swap(int []arr,int i,int j) {
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
}
}
