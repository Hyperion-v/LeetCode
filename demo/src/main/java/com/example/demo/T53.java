package com.example.demo;

import java.util.Arrays;

public class T53 {
    public static int maxSubArray(int[] nums) {

        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
          int a= Arrays.stream(nums).reduce(Integer::sum).getAsInt();
          int b=Arrays.stream(nums).max().getAsInt();
            return Math.max(a,b);
        }
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        for(int i=1;i<nums.length;i++){
        dp[i]=Math.max(dp[i-1]+nums[i],nums[i]);
        }
        return Arrays.stream(dp).max().getAsInt();
    }
    public static void main(String[] args) {
       int[]test=new int[]{-2,1,-3,4,-1,2,1,-5,4};
       T53.maxSubArray(test);
    }
}
