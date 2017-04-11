package com.jd.model.base;

/**
 * @author wangshuxing
 *单例token，在系统web启动时候调取wx api获取唯一token
 */
public class Token {
	 private Token() {}  
	    private  String token;  
	    private static Token instance  = new Token();  
	    public static Token getInstance() {  
	        return instance;  
	    }  
	    public  String getToken() {  
	        return token;  
	    }  
	    public  void setToken(String token) {  
	        this.token = token;  
	    }  
}
