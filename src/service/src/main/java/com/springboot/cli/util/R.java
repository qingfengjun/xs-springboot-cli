package com.springboot.cli.util;
public class R
{


    //包含的数据
    private Object bo;

    private  Object info;

    //成功信息
    public static R ok(Object data)
    {
        R msg = new R();
        msg.setBo(data);
        return msg;
    }
    //成功信息
    public static R ok()
    {
        return R.ok(null);
    }

    //成功信息
    public static R error()
    {
        R msg = new R();
        return msg;
    }

    public Object getBo() {
        return bo;
    }

    public void setBo(Object bo) {
        this.bo = bo;
    }

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }
}
