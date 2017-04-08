package com.jd.web.controller.base;

import java.lang.reflect.Field;
import java.util.List;

import javax.security.auth.login.LoginException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.jd.common.exception.InvalidParamException;
import com.jd.model.base.JsonResult;
import static com.jd.web.controller.base.ErrorCode.INVALID_PARAM;
import static com.jd.web.controller.base.ErrorCode.SYS_UNKNOWN;


public class BaseController {

    private static final Log logger = LogFactory.getLog(BaseController.class);

    @ExceptionHandler(RuntimeException.class)
    public @ResponseBody JsonResult handleRuntimeException(RuntimeException e){
        e.printStackTrace();
        String message = e.getMessage();
        logger.error("系统异常==============》 " + message);
        return new JsonResult(SYS_UNKNOWN, message);
    }

    @ExceptionHandler(InvalidParamException.class)
    public @ResponseBody JsonResult handleInvalidParamException(InvalidParamException e){
        e.printStackTrace();
        String message = e.getMessage();
        logger.error("无效参数==============》 " + message);
        return new JsonResult(INVALID_PARAM, message);
    }
    
    /**
     * @param paramJson
     * @param paramName
     * @throws InvalidParamException
     * 同时校验多个参数是否都存在
     */
    public static void checkParams(JSONObject paramJson, String... paramName) throws InvalidParamException {
        if(null!=paramName){
            for(String name:paramName){
                if (!paramJson.containsKey(name)) {
                    throw new InvalidParamException(name+"参数不能为空值!");
                }
            }
        }
    }
}
