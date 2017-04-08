package com.jd.web.utils;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;
import javax.servlet.ServletContext;

/**
 * WebApplicationHelper
 *
 * @author sunny
 * @version 1.0.0
 * @since 2014-07-31
 */
@Component
public class WebApplicationHelper implements ApplicationContextAware,InitializingBean {

    private final Logger logger = Logger.getLogger(getClass());

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        setStartTime();
    }

    public void setStartTime(){
        if (applicationContext instanceof WebApplicationContext){
            ServletContext context = ((WebApplicationContext) applicationContext).getServletContext();
            String startTime = String.valueOf(System.currentTimeMillis());
            context.setAttribute("startTime",startTime);
            logger.info("WebApplicationHelper|setStartTime|" + startTime);
        }
    }

}
