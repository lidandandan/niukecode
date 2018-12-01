package com.Ajob.find;

import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by yixinf-q on 2018/11/24.
 * 数组元素循环左移，没想到使用这个倒序的方法，如果数组中有7个元素，左移四位和右移三位的结果是一样的，关键就是要会找规律
 */
public class TreeTest {
    public static void main(String[] args) {
        int []a =new int[]{1,2,3,4,5,6,7,8};
        int m=2;

        reverse(a,0,m);
        reverse(a,m+1,a.length-1);
        reverse(a,0,a.length-1);
        for (int n: a) {
            System.out.println(n);

        }
//        Files.copy("/Users/yixinf-q/Downloads/卷1_第10版_中文版_Java核心技术_.pdf","/Users/yixinf-q/Desktop");
    }
    public static void reverse(int b[],int begin,int end)
    {
        for(int i=begin,j=end;i<j;i++,j--){
            int t=b[i];
            b[i]=b[j];
            b[j]=t;
        }
    }
}
