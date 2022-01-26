package com.demo1.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;

/**
 * 接口返回工具类
 *
 * Created by IntelliJ IDEA.
 * User: XD
 * Date: 2021/11/26
 */

@Data
public class JsonData implements Serializable {

    private int code;
    private Object data;
    @JsonInclude(JsonInclude.Include.NON_NULL)  //空字段不返回
    private String msg;


    public JsonData(int code, Object data) {
        this.code = code;
        this.data = data;
    }

    public JsonData(int code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public static JsonData buildSuccess(Object data) {
        return new JsonData(200, data);
    }

    public static JsonData buildError(String msg) {
        return new JsonData(-1, "", msg);
    }

    public static JsonData buildError(String msg, int code) {
        return new JsonData(code, "", msg);
    }


}
