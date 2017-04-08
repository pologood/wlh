package com.jd.model.base;

import java.util.List;

import com.jd.common.enums.ExceptionEnum;

/**
 * ajax响应结果
 */
public class JsonResult {

    private Integer code;

    private Object data;

    private List list;

    private String message;

    private Long totalSize;

    public JsonResult(){}


    public JsonResult(int code, String message){
        this.code = code;
        this.message = message;
    }

    public JsonResult(List list, long totalSize){
        this.code = ExceptionEnum.Success.toCode();
        this.list = list;
        this.totalSize = totalSize;
    }


    public JsonResult(Object data){
        this.code = ExceptionEnum.Success.toCode();
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Long getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
    }

}
