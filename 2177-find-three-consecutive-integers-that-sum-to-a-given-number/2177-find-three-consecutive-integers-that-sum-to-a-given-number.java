class Solution {
    public long[] sumOfThree(long num) {
        if(num%3!=0){
            return new long[0];
        }
        long b = num/3;
         return new long[]{b-1, b, b+1};

        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna