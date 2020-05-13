package com.components.service;

import java.util.Map;

/**
 * 请求数据接口
 * @author JHui.Yang
 * @version $Id: ApiInvokingService.java, v 0.1 2017/7/10 11:46 JHui.Yang Exp $
 */
public interface ApiInvokingService {


    /**
     *  根据地址和参数请求数据
     *  @param address  数据请求地址
     *  @param params 请求参数
     *
     * */
    Object invoking(String address , Map<String,Object> params ) throws Exception;

}
