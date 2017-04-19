package com.jd.service.wx;

import org.springframework.util.StringUtils;

import com.jd.common.enums.Constants;
import com.jd.common.utils.WeixinAPIUtil;
import com.jd.model.base.Token;
import com.jd.model.token.GeneralToken;

/**
 * @author wangshuxing
 *定时任务令公众号的token永不过期
 */
public class TaskService {
	private static Token tokenCache = Token.getInstance(); 
	
	public void getToken() {  
		 GeneralToken gt=WeixinAPIUtil.getToken(Constants.WX_APPID, Constants.WX_APPSECRET);
		 if (gt != null && !StringUtils.isEmpty(gt.getAccess_token())) {  
             System.out.println("====进入定时任务token:" +gt.getAccess_token());  
             tokenCache.setToken(gt.getAccess_token());  
             tokenCache.setAppId(Constants.WX_APPID);
             tokenCache.setSecret(Constants.WX_APPSECRET);
         }  
	 }
}
