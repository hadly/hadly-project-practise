package com.hadly.project;

import com.hadly.project.aop.AopTestBean;
import com.hadly.project.dubbo.consumer.QueryFacadeClient;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.CountDownLatch;

/**
 * Created by hadly on 2017/6/29.
 */
public class Server {
    private static final String CONFIG_LOCATION = "config/spring/application-context.xml";
    private static ClassPathXmlApplicationContext applicationContext;

    public static void main(String[] args) {
        try {
            CountDownLatch latch = new CountDownLatch(1);

            applicationContext = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
            applicationContext.start();

            //startDubboService();
            testAop();

            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    private static void testAop() {
        AopTestBean bean = applicationContext.getBean(AopTestBean.class);
        bean.test();
    }

    private static void startDubboService() {
        invokeProvider((QueryFacadeClient) applicationContext.getBean(QueryFacadeClient.class));
    }

    private static void invokeProvider(QueryFacadeClient queryFacadeClient) {
        try {
            System.out.println("sleep several seconds before consumer invoke provider.");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        queryFacadeClient.query();
    }
}