package com.jd.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.util.StringUtils;

import com.jd.common.enums.Constants;
import com.jd.common.utils.WeixinMessageUtil;
import com.jd.model.base.Token;
import com.jd.model.token.GeneralToken;

/**
 * @author wangshuxing
 *在应用启动的时候先执行获取公众号的token
 */
public class ContextListener implements ServletContextListener {
	@Override  
    public void contextInitialized(ServletContextEvent sce) {  
        String appid = Constants.WX_APPID;  
        String secret = Constants.WX_APPSECRET;  
        GeneralToken gt = WeixinMessageUtil.getToken(appid, secret);  
        if(gt != null && !StringUtils.isEmpty(gt.getAccess_token())){  
            Token.getInstance().setToken(gt.getAccess_token());  
        }  
    }

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}  
}
