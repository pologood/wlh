package com.jd.model.base;

/**
 * @author wangshuxing
 *单例token，在系统web启动时候调取wx api获取唯一token
 */
public class Token {
	 private Token() {}  
	    private  String token; 
	    private  String appId;
	    private  String secret;
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
		public String getAppId() {
			return appId;
		}
		public void setAppId(String appId) {
			this.appId = appId;
		}
		public String getSecret() {
			return secret;
		}
		public void setSecret(String secret) {
			this.secret = secret;
		}  
	    
}
