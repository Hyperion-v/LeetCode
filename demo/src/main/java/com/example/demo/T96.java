package com.example.demo;

//给定一个整数 n，求以 1 ... n 为节点组成的二叉搜索树有多少种？

//思路 卡特兰数
//先去一个点作为顶点,然后左边依次可以取0至N-1个相对应的,右边是N-1到0个,两两配对相乘,就是h(0)*h(n-1) + h(2)*h(n-2) +…+ h(n-1)h(0)=h(n)（能构成h(N)个）
public class T96 {
}
