package com.company;

import java.util.*;

public class T3 {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()!=s.trim().length()){
            return 1;
        }else if(s.length()==0){
            return 0;
        }
        Set<Object> set = new HashSet<>();
        Set<Object>target=new HashSet<>();
        char[] charArray = s.toCharArray();
        int count=0;
        for (int i = 0, charArrayLength = charArray.length; i < charArrayLength; i++) {
            char cur = charArray[i];
            if (set.contains(cur)) {
                if(target.size()<=set.size()){
                    target.clear();
                    target.addAll(set);
                    set.clear();
                    set.add(cur);
                }
                count++;
            } else {
                set.add(cur);
            }
            if(i==charArrayLength-1){
                      if(set.size()>target.size()){
                          target.clear();
                          target.addAll(set);
                          count++;
                      }
            }

        }
        return count>0?target.size():target.size()-1;
    }
    public static void main(String[] args) {


        T3 t3=new T3();
        System.out.println( t3.lengthOfLongestSubstring("dvdf"));


    }

}


