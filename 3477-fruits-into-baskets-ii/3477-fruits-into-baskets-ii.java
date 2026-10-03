class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count =0;
        for(int i=0; i<fruits.length; i++){
            boolean placed = false;
            for(int j=0; j<baskets.length; j++){
                if(baskets[j]>=fruits[i]){
                    baskets[j] = -1;
                    placed = true;
                    break;
                }
            }
            if(!placed){
                count++;
            }
        }
        return count;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna