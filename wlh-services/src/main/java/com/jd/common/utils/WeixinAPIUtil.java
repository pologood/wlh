package com.jd.common.utils;

import java.util.HashMap;
import java.util.Map;

import org.apache.http.client.HttpClient;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonParser;
import com.jd.model.base.Authorize;
import com.jd.model.base.Token;
import com.jd.model.token.GeneralToken;

/**
 * @author wangshuxing
 * 调用微信api的工具类
 */
public class WeixinAPIUtil {
	 //获取公众号的access_token
	public static GeneralToken getToken(String appid, String secret){  
	    	GeneralToken gt = new GeneralToken();  
	        Map<String, String> params = new HashMap<String, String>();  
	        params.put("appid", appid);  
	        params.put("secret", secret);  
	        params.put("grant_type", "client_credential");  
	        String url = "https://api.weixin.qq.com/cgi-bin/token"; 
	        String result=HttpUtil.setGet(url, params);
	        gt=JSON.parseObject(result, GeneralToken.class);
	        System.out.println(JSON.toJSONString(gt));
	        return gt;  
	}  
	//oath认证，根据code换取openid和用户的access_token
	public static Authorize getAuthorize(String code){  
	    Authorize authorize  = null;  
	    Token token = Token.getInstance();  
	    Map<String, String> params = new HashMap<String, String>();  
	    params.put("appid", token.getAppId());  
	    params.put("secret", token.getSecret());  
	    params.put("code", code);  
	    params.put("grant_type", "authorization_code");  
	    String url = "https://api.weixin.qq.com/sns/oauth2/access_token";  
	    String result=HttpUtil.setGet(url, params);
	    authorize =  JSON.parseObject(result, Authorize.class);
	    return authorize;  
	}  
	public static void main(String[] args) {
		WeixinAPIUtil.getToken("wxfc6f0e9d4ede7c71", "69c3cac94912c47f4624fa6407006a99");
	}
}
