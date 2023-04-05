class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Arrays.sort(nums);
         int ans[] = new int[2];
        // int i=0;
        // int j=nums.length-1;
        // while(i<=j){
        //     if((nums[i]+nums[j])<target) 
        //         i++;
        //     else if((nums[i]+nums[j])>target) 
        //         j--;
        //     else {
        //         ans[0]=i;
        //         ans[1]=j;
        //         break;
        //     }
        // }
        // return ans;
        
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if((nums[i]+nums[j]==target) && (i!=j)){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        return ans;
    }
}