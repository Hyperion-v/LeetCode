package com.example.demo;//package com.company;
//
//import java.util.*;
//import java.util.concurrent.atomic.AtomicInteger;
//import java.util.function.BiConsumer;
//import java.util.stream.Collector;
//import java.util.stream.Collectors;
//import java.util.stream.IntStream;
//
//public class T1 {
//
//    public int[] twoSum(int[] nums, int target) {
//       TreeMap<Integer,Integer> map=IntStream.range(0, nums.length)
//                .collect(TreeMap::new,
//                        (m,i)->m.put(target-nums[i],i),
//                        Map::putAll);
//        map.
//        int bound = nums.length;
//        for (int i=0;i<bound;i++) {
//                  int value=nums[i];
//            if(Objects.nonNull(map.get(target-value))){
//               int index= map.get(target-value);
//               map.tailMap(target-value)
//             return   index>i?new int[]{map.get(target - value),i}:new int[]{i,map.get(target-value)};
//            }
//        }
//        return null;
//    }
//    public static void main(String[] args) {
//     T1 t1=new T1();
//     int[]a=new int[]{3,2,4};
//        int[]b={0,3,-3,4,-1};
//        int[]c={2,5,5,11,};
//    int[] bb= t1.twoSum(c,10);
//        System.out.println(bb);
//    }
//
//}
