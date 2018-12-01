package com.Ajob.find;

/**
 * Created by yixinf-q on 2018/11/27.
 * 数组旋转之后找最小值
 */
public class erFenSearchPlus {
    public static void main(String[] args) {
        int[] array = {4, 5, 6, 7, 8, 9, 1,2,2,2, 2, 3,3};
        int left = 0;
        int right = array.length - 1;
        int result = findMin(array, left, right);
        System.out.println(result);
    }


    public static int findMin(int[] array, int left, int right) {

        while(left<right) {
            int mid = (right+left)/2;
            if (array[mid] > array[0]) {
                left = ++mid;
            }
            else  {
                right = mid;
            }
        }
        return array[left];
    }
}


