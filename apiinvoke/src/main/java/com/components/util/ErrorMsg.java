package com.components.util;

/**
 * @author JHui.Yang
 * @version $ Id ErrorMsg.java, v 0.1 2018/8/8 11:24 JHui.Yang Exp $
 **/
public class ErrorMsg {


    private String msg;


    public ErrorMsg(){
    }

    public ErrorMsg(String msg){
        setMsg(msg);
    }


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString(){
        return getMsg();
    }
}
