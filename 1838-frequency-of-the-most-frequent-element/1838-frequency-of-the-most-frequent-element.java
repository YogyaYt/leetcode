class Solution {
    public int maxFrequency(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int res = 0;
        long sum = 0;
        int sizeOfRange;
        Arrays.sort(nums);

        while (r< nums.length){
            sum = sum + nums[r];
            while ((long)nums[r]*(r-l+1) > sum+k){
                sum = sum-nums[l];
                l++;
            }
            res = Math.max(res,(r-l+1));
            r++;
        }

    return res;
        
    }
}