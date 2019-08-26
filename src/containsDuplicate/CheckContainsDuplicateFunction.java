package containsDuplicate;

import java.util.HashSet;
import java.util.Set;

public class CheckContainsDuplicateFunction {
	public boolean containsDuplicate(int[] nums) {
		Set<Integer> distinctSet = new HashSet<>();

		for (int num : nums) {
			if (distinctSet.contains(num)) {
				return true;
			}
			distinctSet.add(num);
		}

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
