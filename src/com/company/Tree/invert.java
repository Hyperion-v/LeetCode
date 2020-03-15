package com.company.Tree;

import java.util.*;
import java.util.stream.Collectors;

public class invert {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;
        public  TreeNode(int x) { val = x; }

        public int getVal() {
            return val;
        }
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
        preOrder(top);
        inOrder(top);
    }
    //前序遍历 根左右
        public static void preOrder(TreeNode root) {
        Stack<TreeNode> stack=new Stack<>();
        while (true){

            while (root!=null){
                System.out.println(root.val);
                stack.push(root);
                root=root.left;
            }
            if(stack.isEmpty()) break;
            root=stack.pop();
                root=root.right;
        }
            System.out.println(stack.stream().map(TreeNode::getVal).collect(Collectors.toList()).toString());
    }
    //中序遍历 左根右
    public static void inOrder(TreeNode root) {
        Stack<TreeNode> stack=new Stack<>();
        while (true){
            while (root!=null){
                stack.push(root);
                root=root.left;
            }
            if(stack.isEmpty()) break;
            root=stack.pop();
            System.out.println(root.getVal());
            root=root.right;
        }
        System.out.println("------------------------------------");

    }
    //中序遍历 左右根
    public static void PostOrder(TreeNode root) {
        Stack<TreeNode> stack=new Stack<>();
        while (true){
            while (root!=null){
                stack.push(root);
                root=root.left;
            }
            if(stack.isEmpty()) break;
            root=stack.pop();
            root=root.right;
            System.out.println(root.getVal());

        }
        System.out.println("------------------------------------");

    }



//    public TreeNode invertTree(TreeNode root) {
//        if(root == null || (root.left == null && root.right == null))
//            return root;
//    while (!haschild(root)){
//        swap()
//    }
//
//        return root;
//    }
//    public TreeNode swap(TreeNode node){
//        TreeNode tmp=node.left;
//            node.left=node.right;
//            node.right=tmp;
//
//
//    }
//    public Boolean haschild(TreeNode node){
//       return node.right!=null||node.left!=null;
//    }
}
