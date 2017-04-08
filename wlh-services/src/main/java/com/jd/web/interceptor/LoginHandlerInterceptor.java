package com.jd.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.jd.common.enums.ExceptionEnum;
import com.jd.common.util.StringUtils;
import com.jd.common.utils.CookieContext;
import com.jd.model.base.JsonResult;
import com.jd.web.controller.login.SsoClient;

public class LoginHandlerInterceptor implements HandlerInterceptor {
    private static Logger log = Logger.getLogger(LoginHandlerInterceptor.class);
	@Autowired
	private SsoClient ssoClient;
	
	private final String[] noFilterStr = new String[]{"userLogout"};
	private boolean noInterceptor(HttpServletRequest request){
		String url = request.getRequestURI();
		if(StringUtils.isEmpty(url)) return true;
		for(String s : noFilterStr){
			if(StringUtils.contains(url, s)){
				return true;
			}
		}
		return false;//需要拦截
	}

	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception  {
		request.setCharacterEncoding("utf-8");
		CookieContext.setCookieContext(null);
        if(noInterceptor(request)){
//        	System.out.println("noInterceptor----");
        	return true;
        }
        JsonResult jsonResult = ssoClient.isLogin(request);
        if(jsonResult.getCode().equals(ExceptionEnum.Success.toCode())){
            	return true;
        }else{//验证失败的跳转到登录页面
        	response.sendRedirect(jsonResult.getData()+"");
            return false;
        }
	}

	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	}

	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	}
}
