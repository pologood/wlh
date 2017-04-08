package com.jd.web.controller.pin;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jd.bdp.ard.cache.client.KeyManagerUtils;
import com.jd.web.controller.base.BaseController;

/**
 * Created by wangyinsheng on 2016/12/9.
 */
@Controller
@RequestMapping("/debug")
public class DebugController extends BaseController{

    private static final Logger logger = LoggerFactory.getLogger(DebugController.class);

    private static final String salt = "idklngpsior34ewn";

    @RequestMapping("/")
    public void debug(@RequestParam("url")String url, @RequestParam("l")String l, HttpServletResponse response) throws Exception{

        logger.info("parameter 'l' is : " + l);

        response.sendRedirect(url);
    }
    /**
     * 清除缓存
     */
    @RequestMapping("/clearCache")
    @ResponseBody
    public String clearCache(HttpServletResponse response) throws Exception{

    	String  result = String.valueOf(KeyManagerUtils.clear());

        return result;
    }
}
