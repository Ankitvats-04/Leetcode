class Solution {
    public int removeDuplicates(int[] nums) {
     if(nums.length<=2){
        return nums.length;
     }

     int i=2;
     for(int j=2;j<nums.length; j++){
        if(nums[j]!=nums[i-2]){
            nums[i]=nums[j];
            i++;
        }
     }
     return i;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna