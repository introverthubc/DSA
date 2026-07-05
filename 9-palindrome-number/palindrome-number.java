class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int dup = x;
        while(x>0){
            int lastdig=x%10;
            rev = (rev*10)+lastdig;
            x=x/10;
        }
        if(rev==dup){
            return true;
        }
        else{
            return false;
        }
    }
}