class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] result = new int[nums.length];
        int even =0 ;
        int odd =1;
         for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0){
                result[even] = nums[i];
                even+=2;
            }
            else{
                result[odd] = nums[i];
                odd+=2;
            }
         }
         return result;
        
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna