package com.file.newfile;


import java.io.File;

/**
 * Created by yixinf-q on 2018/9/27.
 */
public class CreateFile {


    public static void main(String[] args) {
        String filename = "Dockerfile";
        File files = new File("/Users/yixinf-q/Downloads/" + filename);
        try {
            if (files.exists()) {
                System.out.println("文件已经存在");
            }
            files.createNewFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
        int a = 3;
        if (a <= 0) {
            System.out.println("a为负数");
        }
        File file = new File("/Users/yixinf-q/Downloads/");


    }
}
