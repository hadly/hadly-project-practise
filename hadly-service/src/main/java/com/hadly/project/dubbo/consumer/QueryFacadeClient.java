package com.hadly.project.dubbo.consumer;

import com.hadly.project.dubbo.IQueryFacade;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by hadly on 2017/7/21.
 */
@Service
public class QueryFacadeClient {

    @Resource
    private IQueryFacade queryFacade;

    public void query() {
        System.out.println("consumer begin to query.");
        queryFacade.query("client's msg");
    }
}
