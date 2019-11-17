//Given a sorted (in ascending order) integer array nums of n elements and a target value, write a function to search target in nums. 
//If target exists, then return its index, otherwise return -1.

//E: Is the array sorted? What do we do if we can not find the index? Are we returning true or the index? Are there duplicates?
//T: [] target = 3, [0, 1, 2] target = 4, [0, 1, 1, 2, 2] target = 2

//This problem involves a binary search. We know this because we have sorted data, or data in a consistent pattern. We could also use linear search, 
//but binarySearch is O(log2N)


class binarySearch{
	public int binarySearch(int[] nums, int target){
		int start = 0;
		int end = nums.length -1;

		while(start <= end){
			int mid = start + (end-start)/2;
			if(nums[mid] == target){
				return mid;
			}
			if(nums[mid] < target){
				start = mid+1;
			}
			else{
				end = mid -1;
			}
		}
		return -1;

	}

public static void main(String args[]){
	binarySearch ob = new binarySearch(); 
	int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
	int target = 6;
	int result = ob.binarySearch(nums, target); 
	System.out.println(result);


	}
}

//This code works! It's runtime is O(log2N)

