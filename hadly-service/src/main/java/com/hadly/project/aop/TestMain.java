package com.hadly.project.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.CountDownLatch;

/**
 * Created by hadly on 2017/6/29.
 */
public class TestMain {
    private static final String CONFIG_LOCATION = "config/spring/aop-test.xml";
    private static ClassPathXmlApplicationContext applicationContext;

    public static void main(String[] args) {
        try {
            CountDownLatch latch = new CountDownLatch(1);

            applicationContext = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
            applicationContext.start();

            testAop();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    private static void testAop() {
        AopTestBean bean = applicationContext.getBean(AopTestBean.class);
        bean.test();
    }
}