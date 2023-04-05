class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int ans=1,fin=1;
        if(nums.length==0){
            return 0;
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]==(nums[i]+1)){
                ans++;
            }
            
            else if(nums[i+1]-nums[i]!=1 && nums[i+1]!=nums[i]){
                ans=1;
            }
                fin = Math.max(fin,ans);
        }
        return fin;
    }
}