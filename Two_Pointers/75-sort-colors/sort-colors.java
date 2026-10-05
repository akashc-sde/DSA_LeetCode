class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int l = 0,r = n-1,i=0;
        while(i<=r){
            if(nums[i]==0){
                int t = nums[i];
                nums[i] = nums[l];
                nums[l] = t;
                l++;i++;
            }
            else if(nums[i]==2){
                int t = nums[i];
                nums[i] = nums[r];
                nums[r] = t;
                r--;
            }else i++;
        }
    }
}