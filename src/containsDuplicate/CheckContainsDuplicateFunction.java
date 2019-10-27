package containsDuplicate;

import java.util.HashSet;
import java.util.Set;

public class CheckContainsDuplicateFunction {
	// O(n) solution
	public boolean containsDuplicate(int[] nums) {
		// Use a set to store all the distinct elements
		Set<Integer> set = new HashSet<>();
		
		for(int current : nums){
			// If it contains it, return true right away
			if(set.contains(current)){
				return true;
			}
			
			// If it doesn't contain it, add it to hashset
			set.add(current);
		}
		
		// Return false if it does not contain duplicates
		return false;
	}

	// Nlogn solution
	// public boolean containsDuplicate(int[] nums) {
	// Arrays.sort(nums);

	// for(int ind = 1; ind < nums.length; ind++){
	// if(nums[ind] == nums[ind - 1]){
	// return true;
	// }
	// }
	// return false;
	// }
}
