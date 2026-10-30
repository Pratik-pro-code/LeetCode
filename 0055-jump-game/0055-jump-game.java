class Solution {
    public boolean canJump(int[] nums) {
    //    int reachable = 0;
    //    for(int i = 0; i < nums.length; i ++) {
    //        if(i > reachable) return false;
    //        reachable = Math.max(reachable, i + nums[i]);
    //    } 
    //    return true;
    // }
    int canReach =0;
    for(int i = 0; i< nums.length; i++){
        if(i > canReach) return false;
        canReach = Math.max(canReach, i+nums[i]);
        if(canReach >= nums.length-1) return true;

    } 
    return true;
    }
}