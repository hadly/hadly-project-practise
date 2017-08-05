package com.hadly.project.dubbo.provider;

import com.hadly.project.dubbo.IQueryFacade;

/**
 * Created by hadly on 2017/6/29.
 */
public class QueryFacadeImpl implements IQueryFacade {
    public String query(String msg) {
        System.out.println("receive query: " + msg);
        return msg + " -- replyed by QueryFacadeImpl";
    }
}
