class Solution {
    public int findDuplicate(int[] nums) {
        // Set<Integer> n = new HashSet<>();
        // for(int j=0;j<nums.length;j++){
        //     if(n.contains(nums[j])){
        //         return nums[j];
        //     }
        //     else n.add(nums[j]);
        // }
        // return 0;
        int slow = nums[0];
        int fast = nums[0];
        while (true){
            slow = nums[slow];
            fast = nums[nums[fast]];
            if(slow==fast) break;
        }

        slow=nums[0];
        while (slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}