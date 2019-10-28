package containsDuplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckContainsDuplicateFunction {
	// O(n) solution
//	public boolean containsDuplicate(int[] nums) {
//		// Use a set to store all the distinct elements
//		Set<Integer> set = new HashSet<>();
//		
//		for(int current : nums){
//			// If it contains it, return true right away
//			if(set.contains(current)){
//				return true;
//			}
//			
//			// If it doesn't contain it, add it to hashset
//			set.add(current);
//		}
//		
//		// Return false if it does not contain duplicates
//		return false;
//	}

	// Nlogn solution since it needs to be sorted to work
	public boolean containsDuplicate(int[] nums){
		// Sort the array
		Arrays.sort(nums);
		
		// Compare current with previous, that way we know if there is duplicates
		for(int i = 1; i < nums.length; i++){
			if(nums[i] == nums[i - 1]){
				return true;
			}
		}
		
		// return false if we dont find duplicates
		return false;
	}
}
