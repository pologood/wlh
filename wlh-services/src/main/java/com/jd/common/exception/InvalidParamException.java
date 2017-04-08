package com.jd.common.exception;

/**
 * @author wangshuxing
 */
public class InvalidParamException extends RuntimeException {

    public InvalidParamException(String message) {
        super(message);
    }

    public InvalidParamException(String message, Throwable e) {
        super(message, e);
    }

}
