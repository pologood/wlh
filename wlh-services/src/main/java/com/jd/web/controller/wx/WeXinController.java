package com.jd.web.controller.wx;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jd.common.utils.HttpUtil;
import com.jd.model.base.Authorize;
import com.jd.web.controller.base.BaseController;

@Controller
@RequestMapping("/wechat")
public class WeXinController extends BaseController{
	@Value("${app.id}")
    private String appId;
	@Value("${app.secret}")
    private String appSecret;
	
    @RequestMapping(value ="/myInfo")
    public  String  weixinRedirect(HttpServletRequest request, HttpServletResponse response) throws Exception{
    	//1.判断session中是否有本人的信息
    		//无本人信息，调用微信api去认证
    	String authUrl="http://xionganfamily.com.cn/wechat/oauth";
    	return "redirect:https://open.weixin.qq.com/connect/oauth2/authorize?appid="+appId+"&redirect_uri="+authUrl+"?response_type=code&scope=snsapi_base&state=1&connect_redirect=1#wechat_redirect";
    		//有本人信息，去获取
    }
    @RequestMapping(value = "/oauth", method = RequestMethod.GET)
    public String weixinOAuth(HttpServletRequest request, HttpServletResponse response, Model model) {
        //得到code
        String CODE = request.getParameter("code");
        String APPID = appId;
        String SECRET = appSecret;
        //换取access_token 其中包含了openid
        String URL = "https://api.weixin.qq.com/sns/oauth2/access_token";
        Map<String, String> params = new HashMap<String, String>();  
        params.put("appid", APPID);  
        params.put("secret", SECRET);  
        params.put("code", CODE);  
        params.put("grant_type", "authorization_code");  
        String result=HttpUtil.setGet(URL, params);
        JSONObject jsonObj =  JSON.parseObject(result);
        String openid = jsonObj.get("openid").toString();
        
//        model.addAttribute("user", wechatUser);
        return "vip/userInfo";
    }
    
}
