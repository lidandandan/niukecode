package com.test.classs;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Created by yixinf-q on 2018/9/20.
 */
public class TestStudent {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(18);
        s.setName("lidan");

        System.out.println(s.name);
        System.out.println(s.age);

        HashMap<String,Object> hp=new HashMap<>();

        hp.put("student",s);
        System.out.println(hp);
    }
}
