import java.util.*;
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0;
        int right = people.length-1;
        int boat = 0;
        while(left<=right){
            if(people[left]+people[right]<=limit){
               
                right--;
                left++;
            }
            else{
               
                right--;
            }
            boat++;
         
               
            
        }
        return boat;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna