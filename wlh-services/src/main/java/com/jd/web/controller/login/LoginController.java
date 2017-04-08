package com.jd.web.controller.login;

import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/zwx/login")
public class LoginController {

    public static final Logger logger = Logger.getLogger(LoginController.class);

    @Autowired
    private SsoClient ssoClient;

    @RequestMapping(value = "/userLogout", method = RequestMethod.GET)
    @ResponseBody
    public void userLogout(HttpServletRequest request,
                           HttpServletResponse response) {
        String url;
        String path = request.getContextPath();
        if ("/".equals(path)) path = "";
        String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
        try {
            url = ssoClient.logOut(response) + "?ReturnUrl=" + URLEncoder.encode(basePath, "utf-8");
            response.sendRedirect(url);
        } catch (Exception e) {
            logger.error("|LoginController|userLogout|exception|", e);
        }
    }

}
