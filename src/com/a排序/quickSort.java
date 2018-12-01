package com.a排序;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yixinf-q on 2018/11/27.
 * 快排，用到了递归，分为左右两边，跟二叉树其实是一样的，也分为左右两边，要想让在后边的，大小相同时，仍在后边，
 * 就用array[end] >= key，注意是左右两边都有判断，所以对每个判断都有一个while判断，每个while判断只能交换一个数字，两个while判断
 * 下来只能交换两个数字，还不能确定基准数的中间位置，所以还要在外边加一个while判断，这样能够确定中间位置，使左边的比中间位置小，
 * 右边的比中间位置大。然后分别对左右两边进行排序，递归是一层层调用，一层层返回。
 */
public class quickSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(1);

        int[] array ={0,8,22,2,5,4,56,7,21,1,0,9,22,-1};
        System.out.println(Arrays.toString(array));
        int left = 0;
        int right = array.length - 1;
        quickSort(array,left,right);
        System.out.println(Arrays.toString(array));
    }
    public static void quickSort(int[] array,int left,int right) {
        if(right <left)
            return;
        int start = left;
        int end = right;
        int key = array[left];
        while (start < end) {
            while (start < end && array[end] >= key)
                end--;
            array[start] = array[end];
            while (start < end && array[start] < key)
                start++;
            array[end] = array[start];
        }
        array[start] =key;
        quickSort(array,left,start-1);
        quickSort(array,start+1,right);
    }
}
