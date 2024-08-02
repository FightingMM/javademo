package com.project.util;

public enum ResultCode {

    SUCCESS(200, "success"), FAIL(500, "fail");
    private final Integer code;
    private final String msg;

    ResultCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
