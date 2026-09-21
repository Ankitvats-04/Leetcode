class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
       int count = 0;
        
        for(int i=0; i<nums.length-2; i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k = j+1;
            while(j<nums.length-1&&k<nums.length){
                int diff1 = nums[k]-nums[j];
                int diff2 = nums[j]-nums[i];
               if(diff1==diff && diff2==diff){
                count++;
                j++;
                k++;

               }
               else if(diff1<diff){
                k++;
               }
               else if(diff2<diff){
                j++;
               }
               else{
                j++;
               }
               
               
            }


        }
        return count;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna