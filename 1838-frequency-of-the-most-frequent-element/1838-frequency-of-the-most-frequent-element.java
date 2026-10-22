class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int l=0;
        int r =0;
        long sum=0;
        int res=0;

        while(r< nums.length) {
            sum+=nums[r];
            while ((long)nums[r]*(r-l+1) > sum+k){
                sum-=nums[l];
                l+=1;
            }

            res = Math.max(res, r - l + 1);
            r+=1;
        }
        return res;
        
    }
}