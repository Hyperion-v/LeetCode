package com.company.链表;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * */
public class T19 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        Map<Object,ListNode> map=new HashMap<>();
        ListNode curr=head;
        int count=0;
        while (curr!=null){
            if(curr.next==null){
                ListNode delNde=  map.get(count-n);
                ListNode lastnode=  map.get(count-n-1);
            }
            count++;
            map.put(count,head);
            curr=curr.next;
        }
        return null;
    }
    public  static  void  main(String[] args){

    }
}
