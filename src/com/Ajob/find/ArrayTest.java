package com.Ajob.find;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by yixinf-q on 2018/11/24.
 * 奇数在前，偶数在后
 */
public class ArrayTest {
    public int MoreThanHalfNum_Solution(int [] array) {
        Map<Integer,Integer> map = new HashMap();
        int half = array.length/2;
        for(int i=0;i<array.length;i++){
            if(!map.containsKey(array[i])) {
                map.put(array[i],1);
            }
            else{
                map.put(array[i],map.get(array[i])+1);
            }
            if(map.get(array[i])>half)
                return array[i];
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] array = {99,1,8,10,1, 2,20,30,3, 4, 5, 6,7};
//        int oddCount =0;
//        for(int i=0;i<array.length;i++){
//            if(array[i]%2!=0){
//                int temp=array[i];
//                for(int j=i;j>oddCount;j--){
//                    array[j]=array[j-1];
//                }
//                array[oddCount++] =temp;
//            }
//
//
//        }
//        System.out.println(Arrays.toString(array));


        //出现的次数大于一半

//        int length = array.length/2;// 证明数字出现的次数大于length
//        Arrays.sort(array);
//        int result = array[length+1];
//        int count = 0;
//        for(int i =0;i<array.length;i++){
//            if(array[i]==result)
//                count++;
//        }
//        if(count>length)
//            return result;
//        else return 0;


        Map<Integer,Integer> map = new HashMap<>();

        AbstractCollection abstractCollection =new HashSet();








    }
}

