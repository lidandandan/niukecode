package com.json.object;

import com.alibaba.fastjson.JSON;
import org.apache.logging.log4j.core.config.plugins.util.ResolverUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yixinf-q on 2018/11/8.
 */
public class main {
    public static void main(String[] args) {
        RecVo recVo = new RecVo();
        List<TestData> list = new ArrayList<>();
        TestData testData1 = new TestData();
        testData1.setArrtibute(28);
        testData1.setSort(5);
        testData1.setId("l1");
        TestData testData2 = new TestData();
        testData2.setArrtibute(280000);
        testData2.setSort(1);
        testData2.setId("dan");
        list.add(testData1);
        list.add(testData2);
        recVo.setRecVo(list);
        String str = JSON.toJSONString(recVo);
        System.out.println(str);
        RecVo toObj = JSON.parseObject(str,RecVo.class);
        System.out.println(toObj.getRecVo().size());
        String arrJson = JSON.toJSONString(list);
        System.out.println(arrJson);
        List<TestData> arrList = JSON.parseArray(arrJson,TestData.class);
        System.out.println(arrList.get(0).getArrtibute());

    }
}
