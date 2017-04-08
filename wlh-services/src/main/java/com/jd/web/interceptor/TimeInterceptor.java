package com.jd.web.interceptor;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 01
 *
 */
public class TimeInterceptor implements HandlerInterceptor {

    private static final Logger logger = Logger.getLogger(TimeInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        long startTime = System.currentTimeMillis();
        request.setAttribute("monitor_start_time", startTime);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object o, ModelAndView modelAndView) throws Exception {
        long endTime = System.currentTimeMillis();
        logger.info(request.getRequestURL() + "| 页面请求用时| " + (endTime - ((Long) request.getAttribute("monitor_start_time"))));
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object o, Exception e) throws Exception {

    }
}
