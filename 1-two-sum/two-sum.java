class Solution {
    public int[] twoSum(int[] nums, int target) {
       int[] output = new int[2];
       for(int current = 0; current < nums.length; current++){
        for(int i = 0; i < nums.length; i++){
            if (current == i){
                continue;
            }
            else{
                if(nums[current] + nums[i] == target){
                    output[0] = current;
                    output[1] = i;
                }
                else{
                    continue;
                }
            }
        }
       }
        return output;
    }
}