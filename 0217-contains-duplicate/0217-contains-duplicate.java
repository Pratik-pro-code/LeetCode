class Solution {
    public boolean containsDuplicate(int[] nums) {
        // HashMap<Integer,Integer> map =new HashMap<>();
        // for(int num : nums){
            
        //     if(  map.containsKey(num)) return true;
        //     else map.put(num,1);
        //     }
        //     return false;
        

        // or
        // Set<Integer> set = new HashSet<>();
        
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]) return true;
        }
        return false;


    }
}