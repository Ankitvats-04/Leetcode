class Solution {
    public int longestConsecutive(int[] nums) {
           Arrays.sort(nums);
           if(nums.length==0){
            return 0;
           }
        int count = 1;
        int max =1;

        for(int i=0; i<nums.length-1; i++){
            if(nums[i+1]-nums[i]==1){
                count++;
            }
            else if(nums[i+1]==nums[i]){
                continue;
            }
            else{
                count = 1;
            }
            max = Math.max(max, count);
        }
        return max;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna