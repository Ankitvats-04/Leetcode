class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        if(k<=1){
            return 0;
        }
        int count =0;
        int left=0;
        int mul = 1;
        for(int right=0; right<nums.length; right++){
            mul = mul*nums[right];

            while(mul>=k){
                mul = mul/nums[left];
                left++;
            }
            count+=right-left+1;
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna