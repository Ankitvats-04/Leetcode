class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int number =0;

        while(x>0){
            int digit = x%10;
            number = (number*10)+digit;
            x = x/10;
        }
       
        if(number==temp ){
            return true;
        }
        else{
            return false;
        }

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna