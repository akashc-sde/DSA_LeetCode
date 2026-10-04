class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int l=0,r=n-1;
        while(l<=r){
            if(nums[l]==val){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                r--;
            }
            else l++;
        }
        return l;
    }
}