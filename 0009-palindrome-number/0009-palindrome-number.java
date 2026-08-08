class Solution {
    public boolean isPalindrome(int x) {
        int originalNumber = x;
        int rev=0;
        int digit;
        if(x>0){
            while(x!=0){
            digit = x%10;
            x=x/10;
            rev = rev*10+digit;
            }
        }
    return originalNumber==rev;    
    }
}