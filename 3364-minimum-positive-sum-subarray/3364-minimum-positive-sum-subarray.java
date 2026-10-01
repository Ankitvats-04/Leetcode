class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
       int minsum = Integer.MAX_VALUE;
       for(int size = l; size<=r; size++){
        int left=0;
        int sum=0;
        
        for(int right=0; right<nums.size();right++){
            sum+=nums.get(right);
            if(right-left+1==size){
                if(sum>0){
                    minsum = Math.min(minsum,sum);
                }
                sum-=nums.get(left);
                left++;
            }
        }
       }
       if(minsum==Integer.MAX_VALUE){
        return -1;
       }
       return minsum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna