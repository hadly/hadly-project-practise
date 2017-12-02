package com.hadly.project.aop;

import org.springframework.stereotype.Service;

/**
 * @author hadly
 * @since 2017/11/30
 */
@Service
public class AopTestBean {
    private String testStr = "testStr";

    public String getTestStr() {
        return testStr;
    }

    public void setTestStr(String testStr) {
        this.testStr = testStr;
    }

    public void test(){
        System.out.println("test");
    }
}
