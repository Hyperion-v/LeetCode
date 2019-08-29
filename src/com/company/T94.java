package com.company;

//94. 二叉树的中序遍历

import java.util.ArrayList;
import java.util.List;

public class T94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        TreeNode cur =root;
        while (cur.left!=null){
            list.add(cur.val);
        }

        return list;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}
