package com.demo1;

//枚举类
public enum CodeMsg {
     SUCCESS(0,"成功"),

    INTERNAL_ERROR(500,"服务器内部错误"),

    PRODUCT_NOT_EXIST(100001,"商品不存在"),

    ORDER_CLOSED(200001,"交易已关闭"),

    LOGIN_FAIL(300001,"用户名或密码输入错误");

    private int cord;
    private String msg;

    private CodeMsg(int cord , String msg){
        this.cord = cord;
        this.msg = msg;
    }

    public int getCord() {
        return cord;
    }

    public void setCord(int cord) {
        this.cord = cord;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
