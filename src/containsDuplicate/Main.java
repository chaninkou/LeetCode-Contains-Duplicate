package containsDuplicate;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,5};
		
		System.out.println("Input: " + Arrays.toString(nums));
		
		CheckContainsDuplicateFunction solution = new CheckContainsDuplicateFunction();
		
		System.out.println("Solution: " + solution.containsDuplicate(nums));
	}
}
