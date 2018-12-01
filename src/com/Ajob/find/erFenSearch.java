package com.Ajob.find;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by yixinf-q on 2018/11/25.
 * 二分查找，不需要用递归
 */
public class erFenSearch {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int left = array[0];
        int right = array[array.length-1];
        int a = find(array, left, right);
        System.out.println(a);
    }
    public static int find(int[] array,int left,int right) {
        while (left <= right) {

            int mid = left + (right-left) / 2;
            if (8 == array[mid]) {
                return mid;

            } else if (8> array[mid]) {
                left = mid++;
              //  find(array, left, right);
            } else {
                right = mid--;
               // find(array,left, right);
            }


        }
        return -1;
    }
}
