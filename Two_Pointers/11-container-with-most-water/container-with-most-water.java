class Solution {
    public int maxArea(int[] height) {
        int left = 0,right = height.length-1;
        int maxArea = 0;
        while(left < right){
            int ht = Math.min(height[left],height[right]);
            int wd = right - left;
            maxArea = Math.max(maxArea, ht*wd);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}