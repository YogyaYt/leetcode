class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i;
        int j;
        int l = nums.length;
        for (i=0;i<l;i++){
            for(j=i+1;j<l;j++){
                if(nums[i]+nums[j]== target){
                    return new int[] {i,j};
                }
            }

        }
        return new int[]{};
    
    }
}