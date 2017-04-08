package com.jd.common.utils;

import com.jd.common.util.StringEscapeUtils;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Collections;
import java.util.List;

/**
 * Cookie上下文,记录用户信息，拦截器会赋值
 * @author wang.leifeng
 * @since 2013-4-18
 */
public class CookieContext {
    private final static Log log = LogFactory.getLog(CookieContext.class);
	static ThreadLocal<CookieContext> actionContext = new ThreadLocal<CookieContext>();

    private Integer userId;//用户id
    private String userLoginName;//登录名称
    private String realName;
    private long created = System.currentTimeMillis();
	/**
     * 放入线程共用的地方ThreadLocal
     * @param cookieContext 对象
     */
    public static void setCookieContext(CookieContext cookieContext) {
    	actionContext.remove();
		actionContext.set(cookieContext);
    }

    /**
     * 取出登录的上下文
     *
     * @return null 如果没有的话
     */
    public static CookieContext getCookieContext() {
        return actionContext.get();
    }

    /**
     * 反向构造上下文。
     *
     * @param value 需要反向构造的串。形式如下：userId=123,userLoginName=bjwangleifeng,realName=王雷锋,role=ABC,depId=123,created=1375545661133
     * @return 上下文
     * @see #toCookieValue()
     */
    public static CookieContext parse(String value) {
        CookieContext context = new CookieContext();
        setValue(value, context);
        return context;
    }

    /**
     * Method setValue ...
     *
     * @param value   of type String
     * @param context of type LoginContext
     */
    protected static void setValue(String value, CookieContext context) {
        if (StringUtils.isNotEmpty(value)) {
            String[] fields = value.split(",");
            for (String keyValues : fields) {
                String[] keyValue = keyValues.split("=");
                if (keyValue.length == 2) {
                    try {
                        String field = keyValue[0];
                        if (StringUtils.isNotBlank(field)) {
                            BeanUtils.setProperty(context, field, StringEscapeUtils.unescapeCombinedCookie(keyValue[1]));
                        }
                    } catch (Exception e) {
                        log.warn("sys cookie praser error!", e);
                    }
                }
            }
        }
    }


    /**
     * 将实体系列化成字符串。
     * 2010-12-17 yang.siyong改进：默认值不再写入cookie，以减少cookie的大小。
     *
     * @return 字符串。形式：字段1=值1,字段2=值2。该方法不会返回空
     * @see #parse(String)
     */
    public String toCookieValue() {
        final StringBuilder sb = new StringBuilder();
        sb.append("created=").append(created);
        if (userId != null && userId != 0) {
            sb.append(",userId=").append(userId);
        }
        if (StringUtils.isNotEmpty(userLoginName)) {
            sb.append(",userLoginName=").append(StringEscapeUtils.escapeCombinedCookie(userLoginName));
        }
        if (StringUtils.isNotEmpty(realName)) {
            sb.append(",realName=").append(StringEscapeUtils.escapeCombinedCookie(realName));
        }
        return sb.length() > 0 ? sb.substring(1) : "";
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserLoginName() {
        return userLoginName;
    }

    public void setUserLoginName(String userLoginName) {
        this.userLoginName = userLoginName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public long getCreated() {
        return created;
    }

    public void setCreated(long created) {
        this.created = created;
    }
}
