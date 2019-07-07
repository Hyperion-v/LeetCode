package com.company;

public class T198 {
    public  static  int rob(int[] nums) {

        //状态转移方程 max(dp[i-2]+nums[0],dp[i-1])
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        int max=0;
        for(int i=2;i<nums.length;i++){
            dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
             if(max<dp[i]){
                 max=dp[i];
             }
        }
        return max;
    }
    public static void main(String[] args) {
        int[]test1=new int[]{2,1,1,2};

        int[]test=new int[]{1,2,3,1};
        T198.rob(test1);
    }
}
