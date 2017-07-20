package com.ctg.common;

/**
 * Created by hfangjian on 2017/6/28.
 */
public enum ResponseCode {

    //0:成功； 描述:SUCCESS
    SUCCESS(0,"SUCCESS"),

    //1:错误（即失败）； 描述:ERROR
    ERROR(1,"ERROR"),

    //10：未登录；描述：NEED_LOGIN
    NEED_LOGIN(10,"NEED_LOGIN"),

    //2：非法参数；描述：ILLEGAL_ARGUMENT
    ILLEGAL_ARGUMENT(2,"ILLEGAL_ARGUMENT");

    private final int code;
    private final String desc;

    ResponseCode(int code,String desc){
        this.code = code;
        this.desc = desc;
    }

    public int getCode(){
        return code;
    }
    public String getDesc(){
        return desc;
    }
}
