package com.company;

//94. 二叉树的中序遍历

//左根右
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class T94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        LinkedList <TreeNode>linkedList=new LinkedList<>();
        TreeNode curr =root;
        while (curr != null || !linkedList.isEmpty()) {
            //一直遍历左子节点+
            while  (curr != null) {
                linkedList.push(curr);
                curr = curr.left;
            }
            curr = linkedList.pop();
            list.add(curr.val);
            curr = curr.right;
        }

        return list;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        TreeNode top= new TreeNode(1);
        TreeNode l1= new TreeNode(2);
        TreeNode r1= new TreeNode(3);
        top.left=l1;
        top.right=r1;
        TreeNode l2= new TreeNode(4);
        TreeNode r2= new TreeNode(5);
        l1.left=l2;
        l1.right=r2;
        TreeNode f= new TreeNode(6);
        r1.left=f;
        T94 t94=new T94();
        System.out.println(t94.inorderTraversal(top));


    }
}
