package com.file.newfile;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Created by yixinf-q on 2018/9/12.
 */
public class ByteArrayOutput {
    public static void main(String[] args) throws IOException{
        ByteArrayOutputStream byteArrayOutput=new ByteArrayOutputStream(12);
        while (byteArrayOutput.size()!=10)
        {
            byteArrayOutput.write(System.in.read());
        }
        byte b[]=byteArrayOutput.toByteArray();
        System.out.println("print the content");
        for(int x=0;x<b.length;x++)
        {
            System.out.print((char)b[x]  + "   ");
        }
            System.out.println(" ");
        int c;
        ByteArrayInputStream byteArrayInputStream=new ByteArrayInputStream(b);
        System.out.println("coverting characters to upper case");
        for(int i=0;i<1;i++)
        {
            while((c=byteArrayInputStream.read())!=-1)
            {
                System.out.println(Character.toUpperCase((char)c));
            }
            byteArrayInputStream.reset();
        }
    }
}
