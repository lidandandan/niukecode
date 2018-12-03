package com.socket.S;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;

/**
 * Created by yixinf-q on 2018/12/3.
 */
public class SocketClient {
    public static void main(String[] args) {
        try{
            InetAddress address = InetAddress.getLocalHost();
            address.getHostName();
            address.getHostAddress();
            byte[] bytes = address.getAddress();
            System.out.println(address.getHostName());
            System.out.println(address.getHostAddress());

            URL baidu =new URL("http://www.baidu.com");
            URL url = new URL(baidu,"/index.html?username=tom#test");
            url.getProtocol();
            url.getPort();
            url.getFile();
            url.getPath();
            url.getRef();
            url.getQuery();
            System.out.println(url.getProtocol());
            System.out.println(url.getPort());
            System.out.println(url.getFile());
            System.out.println(url.getPath());
            System.out.println(url.getRef());
            System.out.println(url.getQuery());


            URL url1 = new URL("http://www.baidu.com");
            InputStream is = url1.openStream();
            InputStreamReader isr = new InputStreamReader(is,"UTF-8");
            BufferedReader br = new BufferedReader(isr);


        }catch(Exception  e){
            e.printStackTrace();
        }

    }



}
