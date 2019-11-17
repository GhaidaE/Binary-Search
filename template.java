//Program to go over the Pathrise template for Binary Search

class Solution {
public int template(int[] nums, int target){
	int start = 0;
	int end = nums.length -1;

	while(start + 1 < end){
		int mid = start + (end-start)/2;
		if(nums[mid] == target){
			return mid;
		}
		else if (nums[mid] < target){
			start = mid;
		}
		else{
			end = mid;
		}
	
	}
		//Post Processing
    
    	if(nums[start] == target){
			return start;
		}
		if(nums[end] == target){
			return end;
		}
		return -1;
        
	}
}

//Official Template in Python:

def binarySearch(arr, target):
	left = 0
	right = len(arr) - 1

	//without the +1 here, the returning of mid without +/- 1 will cause an Infinite loop!
	while left + 1 < right:
		//accounts for integer overflow in python
		mid = (left + right) //2
		if arr[mid] == target:
			return mid
		if arr[mid] < target:
			left = mid
		else:
			right = mid

//Post Processing stage
//Do not introduce other if/else inside loop as that will cause errors
//Break out of loop to analyze left and right pointers

if arr[left] == target: return left
if arr[right] == target: return right

return -1