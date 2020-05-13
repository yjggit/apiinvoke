package com.components.service;


import com.components.entities.LoggingEvent;

import java.util.List;
import java.util.Map;

/**错误日志查询接口
 * @author JHui.Yang
 * @version $Id SystemLogService.java, v 0.1 2018-11-13 10:40 JHui.Yang Exp $$
 */
public interface SystemLogService {


    List<Map<String,Object>> queryLogEvent(Long start , Long end , Long day, Integer limitStart, Integer limitSize);



    /**
     *
     * 根据 event_id 查询日志基本描述
     * @param event_id
     * @return Map<String,Object> 基本描述
     *
     * */
    Map<String,Object> logDetail(long event_id);


    /**
     *
     * 根据 event_id 查询异常日志详情
     * @param event_id
     * @return List<Map<String,Object>> 日志详情
     *
     * */
    List<Map<String,Object>> logExceptionDetail(long event_id);

    /**
     * 查询指定时间内的报错日志
     * @param minute 分钟
     * @return
     */
    List<LoggingEvent> findApiErrorEventPeriod(long minute);
}
