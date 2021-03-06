package com.interview101;



import java.util.*;

public class BM4 {

    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        if(list1==null)
            return list2;
        if(list2 == null)
            return list1;
        while (list1!=null || list2!= null){
            if(list1.val <= list2.val){
                cur.next = list1;
                list1 = list1.next;
                cur = cur.next;
            }else{
                cur.next = list2;
                list2 = list2.next;
                cur = cur.next;
            }
            if(list1 == null){
                cur.next = list2;
                break;
            }
            if(list2 == null){
                cur.next = list1;
                break;
            }
        }
        return head.next;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] params1 = sc.nextLine().trim().split(" ");
        String[] params2 = sc.nextLine().trim().split(" ");
        ListNode head1 = new ListNode(-1);
        ListNode head2 = new ListNode(-1);
        ListNode cur1 = head1;
        ListNode cur2 = head2;
        for (int i = 0; i < params1.length; i++) {
            cur1.next = new ListNode(Integer.parseInt(params1[i]));
            cur1 = cur1.next;
        }
        for (int i = 0; i < params2.length; i++) {
            cur2.next = new ListNode(Integer.parseInt(params2[i]));
            cur2 = cur2.next;
        }
        BM4 bm4 = new BM4();
        ListNode res = bm4.Merge(head1.next, head2.next);
    }
}
