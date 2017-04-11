package com.jd.common.utils;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jd.model.token.GeneralToken;

public class WeixinMessageUtil {
	 
	public static GeneralToken getToken(String appid, String secret){  
	    	GeneralToken gt = new GeneralToken();  
	        Map<String, String> params = new HashMap<String, String>();  
	        params.put("appid", appid);  
	        params.put("secret", secret);  
	        params.put("grant_type", "client_credential");  
	        String url = "https://api.weixin.qq.com/cgi-bin/token"; 
	        String result=HttpUtil.setGet(url, params);
	        JSONObject ob=JSON.parseObject(result);
	        gt.setAccess_token(ob.getString("access_token"));
	        gt.setExpires_in(ob.getString("expires_in"));
	        gt.setErrcode(ob.getString("errcode"));
	        gt.setErrmsg(ob.getString("errmsg"));
	        System.out.println(JSON.toJSONString(gt));
	        return gt;  
	}  
	public static void main(String[] args) {
		WeixinMessageUtil.getToken("wxfc6f0e9d4ede7c71", "169c3cac94912c47f4624fa6407006a99");
	}
}
