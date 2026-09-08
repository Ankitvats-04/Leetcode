class Solution {
    public int maxProduct(int[] nums) {
     int maxproduct = nums[0];
     int minproduct = nums[0];
     int answer = nums[0];

     for(int i = 1; i<nums.length; i++){
        int current = nums[i];

        int oldmax = maxproduct;
        int oldmin = minproduct;
        maxproduct = Math.max(current, Math.max(oldmax*current, oldmin*current));
        minproduct = Math.min(current,Math.min(oldmax*current, oldmin*current));

        answer = Math.max(answer,maxproduct);
     }
     return answer;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna