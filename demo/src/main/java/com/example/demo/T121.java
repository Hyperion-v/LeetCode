package com.example.demo;

public class T121 {
    public static  int maxProfit(int[] prices) {
        // 前i天的最大收益 = max{前i-1天的最大收益，第i天的价格-前i-1天中的最小价格}
        int[]dp1=new int[prices.length];
        int[]dp2=new int[prices.length];
        dp1[0]=0;
        dp2[0]=prices[0];
        int max=Integer.MIN_VALUE;
        for(int i=1;i<prices.length;i++){
            dp2[i]=Math.min(dp2[i-1],prices[i]);
            dp1[i]=Math.max(dp1[i-1],prices[i]-dp2[i-1]);
            if(max<dp1[i]){
                max=dp1[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[]test1=new int[]{7,6,4,3,1};

        int[]test=new int[]{7,1,5,3,6,4};
        T121.maxProfit(test);
    }
}
