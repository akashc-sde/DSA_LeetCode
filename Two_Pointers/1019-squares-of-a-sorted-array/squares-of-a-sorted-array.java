// class Solution {
//     public int[] sortedSquares(int[] nums) {
//         int n=nums.length;
//         int[] res = new int[n];
//         int i = 0,j=n-1;
//         for(int k=n-1;k>=0;k--){
//             if(Math.abs(nums[i])>=Math.abs(nums[j])){
//                 res[k] = nums[i]*nums[i];
//                 i++;
//             }
//             else{
//                 res[k] = nums[j]*nums[j];
//                 j--;
//             }
//         }
//         return res;
//     }
// }
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}