class Solution {
    private int[] findInter(int[] nums,Set<Integer> s){
        Set<Integer> res = new HashSet<>();
        for(int i: nums){
            if(s.contains(i)){
                res.add(i);
            }
                
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
    public int[] intersection(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n=0;
        if(n1>n2){
            Set<Integer> s = new HashSet<>();
            for(int i:nums1){
                s.add(i);
            }
            return findInter(nums2,s);
        }
            
        else{
            Set<Integer> s = new HashSet<>();
            for(int i:nums2){
                s.add(i);
            }
            return findInter(nums1,s);
        }
    }
}