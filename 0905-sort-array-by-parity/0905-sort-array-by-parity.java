class Solution {
    public int[] sortArrayByParity(int[] nums) {

        // Using two pointer in the same direction
        int left =0;
        for(int right = 0; right<nums.length; right++){
            if(nums[right]%2==0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
        return nums;
    }
}

// solve using two pointer opposite direction

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna