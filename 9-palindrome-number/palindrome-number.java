class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        else if(x < 10 && x >= 0){
            return true;
        }
        else{
            String num = "" + x;
            int left = 0;
            int right = num.length() - 1;

            while (left < right) {
                if (num.charAt(left) != num.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}