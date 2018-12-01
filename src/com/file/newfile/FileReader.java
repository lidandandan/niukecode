package com.file.newfile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by yixinf-q on 2018/9/29.
 */
public class FileReader {
    public static void main(String[] args) {
        String  str;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输下字符，按end键退出");
        try {
            do{
                str=br.readLine();
                System.out.println(str);
            }while (!("end"==str));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
