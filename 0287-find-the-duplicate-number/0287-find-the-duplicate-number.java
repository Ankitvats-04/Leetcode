class Solution {
    public int findDuplicate(int[] nums) {
      int left =1;
      int right  = nums.length-1;
      while(left<right){
        int mid = left+(right-left)/2;
        int count  =0;
        for(int val:nums){
            if(val<=mid){
                count++;
            }
        }
        if(count>mid){
            right = mid;
        }
        else{
            left= mid+1;
        }
      }
      return left;
     
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna