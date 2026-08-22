/*class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int b = n/2;
       
         HashMap<Integer,Integer> map = new HashMap<>();

            for(int val:nums){
                map.put(val, map.getOrDefault(val,0) + 1);

            }
            for(int i=0; i<n; i++){
                if(map.get(nums[i])>b){
                     return nums[i];

                }
               
            }

        return -1;   */

        class Solution {
    public int majorityElement(int[] nums) {

        int candidate = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (count == 0) {
                candidate = nums[i];
            }

            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
} 
        
    


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna