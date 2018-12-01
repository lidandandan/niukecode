package com.file.newfile;

import java.io.File;

/**
 * Created by yixinf-q on 2018/9/12.
 */
public class DirList {
    public static void main(String[] args) {
        int age;
        String name;

        String dirname="/Users/yixinf-q/Downloads/";
        File f1=new File(dirname);
        if(f1.isDirectory())
        {
            System.out.println("Directory of "+dirname);
            String s[]=f1.list();
            for(int i=0;i<s.length;i++)
            {
                File f=new File(dirname+"/"+s[i]);

                try {
                    if(f.isFile())
                    {
                        System.out.println(s[i]+"this is a file");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (f.isDirectory())
                        {
                            System.out.println(s[i]+"This is a directory");

                        }
            }
        }

    }
}
