package com.company.链表;


class T2 {
     public static class ListNode {
         int val;
         ListNode next;

         ListNode(int x) {
             val = x;
         }
     }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {


        ListNode l1next = l1;
        ListNode l2next = l2;
        ListNode listNode=new ListNode(0);
        StringBuilder builder=new StringBuilder();
        int carry=0;
        while (l1next!=null||l2next!=null){
            int val1= l1next==null?0:l1next.val;
            int val2= l2next==null?0:l2next.val;
            int sum = val1 + val2+carry;
            carry=sum/10;
            System.out.println(sum % 10);
            listNode.next = new ListNode(sum % 10);
            listNode = listNode.next;
            builder.append(sum);
            if (l1next != null) l1next = l1next.next;
            if (l2next != null) l2next = l2next.next;
        }
        if (carry > 0) {
            listNode.next = new ListNode(carry);
        }
        System.out.println(builder.toString());
        return listNode.next;
    }

        public static void main(String[] args) {
       ListNode l= new ListNode(2);
            ListNode l2=  l.next=new ListNode(4);
            ListNode l3=  l2.next=new ListNode(3);

            ListNode r= new ListNode(5);
            ListNode r2=  r.next= new ListNode(6);
            ListNode r3=  r2.next= new ListNode(4);
//            ListNode r4=  r3.next= new ListNode(9);
//            ListNode r5=  r4.next= new ListNode(9);
//            ListNode r6=  r5.next= new ListNode(9);
//            ListNode r7=  r6.next= new ListNode(9);
//            ListNode r8=  r7.next= new ListNode(9);
//            ListNode r9=  r8.next= new ListNode(9);
//            ListNode r10=  r9.next= new ListNode(9);


            T2 t2=new T2();
          System.out.println( t2.addTwoNumbers(l,r));


        }
}
