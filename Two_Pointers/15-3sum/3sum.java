class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();
        for(int i = 0; i< n-2; i++){
            if(i!=0 && nums[i]==nums[i-1]) continue;
            if(nums[i]>0)break;
            int j=i+1,k=n-1;
            while(j<k){
                int target = nums[i] + nums[j] + nums[k];
                if(target>0)k--;
                else if(target<0) j++;
                else{
                    List<Integer> tempo = new ArrayList<>();
                    tempo.add(nums[i]);
                    tempo.add(nums[j]);
                    tempo.add(nums[k]);
                    res.add(tempo);
                    j++;k--;
                    while(j<k && nums[j]==nums[j-1])j++;
                }
            }
        }
        return new ArrayList(res);
    }
}