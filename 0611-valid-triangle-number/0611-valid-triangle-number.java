class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int triangle = 0;
        for(int k=nums.length-1; k>=2;k--){
            int i =0 ;
            int j = k-1;

            while(i<j){
                if(nums[i] + nums[j]>nums[k]){
                  
                    triangle+=j-i;
                    j--;
                }
                else{
                    i++;
                }

            }
        }
        return triangle;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna