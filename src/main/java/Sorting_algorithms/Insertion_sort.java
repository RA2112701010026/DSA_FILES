package Sorting_algorithms;

public class Insertion_sort {
	
	public static void main(String arr[]) {
		int nums[]= {8,5,67,8,9,4,1};
		
		for(int i = 1;i<nums.length;i++) {
			int j=i-1;
			int key = nums[i];
			while (j>=0 && nums[j]>key) {
				
				nums[j+1]=nums[j];
				
				j--;
				
				
			}
			nums[j+1]=key;
		}
		for (int rowan : nums) {
			System.out.print(rowan);
		}
		
		
		
	}

}
