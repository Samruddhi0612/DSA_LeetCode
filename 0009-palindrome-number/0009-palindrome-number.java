class Solution {
    public boolean isPalindrome(int x) {
        int ans = 0,rem=0;
        int num=x;
        if(x<0)
            return false;
        while(x!=0){
            rem=x%10;
            ans=(rem)+ans*10;
            x=x/10;
            System.out.println(rem);
            System.out.println(ans);
            System.out.println(x);
        }
        if(ans==num)
            return true;
        else
            return false;
    }
}