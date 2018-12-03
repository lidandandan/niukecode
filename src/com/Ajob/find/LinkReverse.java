package com.Ajob.find;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;


class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

/**
 * Created by yixinf-q on 2018/12/1.
 * 链表重置，可以用两个链表，也可以用栈
 */
public class LinkReverse {
    public static void main(String[] args) {

        int[] pre ={1,2,4,7,3,5,6,8};
        int[] in={4,7,2,1,5,3,8,6};
        TreeNode treeNode =reConstructBinaryTree(pre, in,0,pre.length-1,0,in.length-1);
        System.out.println(treeNode.val);

    }

    public static  TreeNode reConstructBinaryTree(int [] pre,int [] in,int pst,int ped,int ist,int ied) {
        //1 保证递归会停止
        if(pst>ped || ist>ied)
            return null;
        //2建立根节点
        TreeNode root = new TreeNode(pre[pst]);
        //3 查找中序的根节点
        int i =ist;
        for(;i <ied;i++){
            if(in[i] == pre[pst])
                break;
        }
        int ll = i- ist;
        root.left = reConstructBinaryTree( pre, in, pst+1, pst+ll, ist, ist+ll-1);
        root.right = reConstructBinaryTree( pre, in, pst+ll+1, ped, ist+ll+1, ied);
        return root;
    }

}
