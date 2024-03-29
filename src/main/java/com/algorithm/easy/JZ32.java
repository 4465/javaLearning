package com.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class JZ32 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root!=null){
            queue.add(root);
        }
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            ans.add(node.val);
            if(node.left != null){
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
            }
        }
        return ans;
    }
}
