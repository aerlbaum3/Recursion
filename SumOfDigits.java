
public class SumOfDigits {

	public static void main(String[] args) {
		int[] nums = {0,2,7,9,3};
		int start = 0, end = 9;
		
		System.out.println(sumOfArray(nums, nums.length - 1));
		
	}

	private static int sumOfArray(int[] nums, int i) {
		//base case 
		if(i == 0) {
			return nums[i];
		}
		
		return nums[i] + sumOfArray(nums, i - 1);
		
	}
	
}

