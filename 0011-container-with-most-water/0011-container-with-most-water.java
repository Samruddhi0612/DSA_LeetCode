class Solution {
    public int maxArea(int[] height) {
        int ans=0;
        int ans1=0;
        int n = height.length;
        int i=0;
        int j=n-1;
        while(i!=j){
            if(height[j]>height[i]){
                ans=Math.max((height[i]*(j-i)),ans);
                i++;
            }
            else{
                ans1=Math.max((height[j]*(j-i)),ans1);
                j--;
            }
        }
        return Math.max(ans,ans1);
    }
}