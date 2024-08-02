package com.project.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Aiden
 * @date 2022/06/23 9:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseResponse<T> {

    /*返回体*/
    private Integer code;
    private String msg;
    private T data;


    /**
     * success
     **/
    public BaseResponse<T> success(T object) {
        BaseResponse result = new BaseResponse();
        result.setCode(ResultCode.SUCCESS.getCode());
        result.setMsg(ResultCode.SUCCESS.getMsg());
        result.setData(object);
        return result;
    }


    /**
     * fail
     **/
    public BaseResponse<T> fail(T object) {
        BaseResponse<T> result = new BaseResponse<T>();
        result.setCode(ResultCode.FAIL.getCode());
        result.setMsg(ResultCode.FAIL.getMsg());
        result.setData(object);
        return result;
    }

    public BaseResponse<T> fail(String msg) {
        BaseResponse<T> result = new BaseResponse<T>();
        result.setCode(ResultCode.FAIL.getCode());
        result.setMsg(msg);
        return result;
    }


    public BaseResponse<T> result(Integer code, String msg, T object) {
        BaseResponse<T> result = new BaseResponse<T>();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(object);
        return result;
    }

}
