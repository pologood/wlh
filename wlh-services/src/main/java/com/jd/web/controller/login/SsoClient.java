package com.jd.web.controller.login;

import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jd.common.enums.ExceptionEnum;
import com.jd.common.utils.CookieContext;
import com.jd.common.web.LoginContext;
import com.jd.model.base.JsonResult;
import com.jd.ssa.exception.SsoException;
import com.jd.ssa.service.SsoService;
import com.jd.web.ws.client.hrm.User;

/**
 * 登录相关服务
 *
 * @author Michael CHeung
 * @since 2014-1-17
 */
@Component("ssoClient")
public class SsoClient {
    private static Logger log = Logger.getLogger(SsoClient.class);

    private static  String erpLoginAddress="http://ssa.jd.com/sso/logout";

    @Autowired
    private SsoService ssoService;

    /**
     * 检查登录
     */
    public JsonResult isLogin(HttpServletRequest request) {
        JsonResult jsonResult = new JsonResult();
        CookieContext cookieContext = getCookieContext(request);
        if (cookieContext != null) {
            jsonResult.setCode(ExceptionEnum.Success.toCode());
            CookieContext.setCookieContext(cookieContext);
        } else {
            jsonResult.setCode(ExceptionEnum.NoLogin.toCode());
            jsonResult.setMessage(ExceptionEnum.NoLogin.toDescription());
            String path = request.getContextPath();
            if ("/".equals(path)) path = "";
            String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + request.getRequestURI();
            //http://v1.erp.jd.com/newhrm/jdlogin.aspx?returnUrl=http://erp.jd.com/index.tpsml
            jsonResult.setData(erpLoginAddress + "?returnUrl=" + URLEncoder.encode(basePath));
        }
        return jsonResult;
    }


    public String logOut(HttpServletResponse response) {
        return erpLoginAddress;
    }

    /**
     * 通过Cookie验证登录（系统本身Cookie 或 ERP Cookie）
     *
     * @return 未登录的返回NULL
     */
    private CookieContext getCookieContext(HttpServletRequest request) {
        if (request == null) {
            return null;
        }
        //调用新的sso单点登录
        LoginContext context = com.jd.common.web.LoginContext.getLoginContext();
        long userId=context.getUserId();
        String erp =context.getPin(); 
        String realName ="";
        try {
        	realName=ssoService.getUserInfo(erp).getUsername();
		} catch (SsoException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        User user = new User();
        user.setId(Integer.parseInt(String.valueOf(userId)));
        user.setName(erp);
        user.setRealName(realName);
        return toCookieContext(user);
    }

    private CookieContext toCookieContext(User user) {
        CookieContext cookieContext = null;
        if (user != null) {
            cookieContext = new CookieContext();
            cookieContext.setUserId(user.getId());
            cookieContext.setUserLoginName(user.getName());
            cookieContext.setRealName(user.getRealName());
        }
        return cookieContext;
    }
}
