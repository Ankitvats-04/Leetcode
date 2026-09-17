class Solution {
    public int[] replaceElements(int[] nums) {
       int [] result = new int[nums.length];
      
       int max = -1;
       for(int i =nums.length-1; i>=0; i--){
        result[i] = max;
        if(nums[i]>max){
            max = nums[i];
        }
       }
       return result;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna