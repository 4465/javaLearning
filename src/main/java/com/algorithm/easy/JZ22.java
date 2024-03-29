package com.algorithm;


public class JZ22 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param pHead ListNode类
     * @param k int整型
     * @return ListNode类
     */
    public ListNode FindKthToTail (ListNode pHead, int k) {
        // write code here
        int length = 0, count = 0;
        ListNode curr = pHead;
        while(curr != null){
            curr = curr.next;
            length += 1;
        }
        curr = pHead;
        if(k>length){
            pHead = null;
        }
        while(curr != null){
            curr = curr.next;
            count += 1;
            if(count==length-k){
                pHead = curr;
            }
        }
        return pHead;
    }
}
