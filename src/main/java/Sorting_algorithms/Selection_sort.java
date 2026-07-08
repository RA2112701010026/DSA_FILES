package Sorting_algorithms;

public class Selection_sort {
public static void main(String arr[]) {
	
	int nums[]= {9,4,5,2,1,6,7};
    int minIndex=0;
	
	for(int i=0 ;i<nums.length-1;i++ ) {
		minIndex=i;
		for(int j = i+1 ;j<nums.length;j++) {
			if (nums[j]<nums[minIndex]) {
				minIndex=j;
				
			}
		
		}
		int temp = nums[minIndex];
		nums[minIndex]=nums[i];
		nums[i]=temp;
	}
	for(int numss:nums) {
		System.out.print(numss);
	}
	
}
}
