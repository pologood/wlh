package com.jd.web.controller.pin;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.jd.model.base.JsonResult;
import com.jd.model.pin.NoticeModel;

@Controller
public class NoticeTofController {

    public static final Logger logger = Logger.getLogger(NoticeTofController.class);

    
    @RequestMapping(value = "/tof/notice/view")
    public String index() {
        return "manage/notice";
    }

    /**
     * 插入新的公告
     * @param model
     * @return
     */
    @RequestMapping(value = "/tof/notice/insert")
    @ResponseBody
    public JsonResult insert(NoticeModel model) {
        logger.error("|NoticeController|insert|model|" + JSON.toJSONString(model));
        JsonResult result = new JsonResult();
            return result;
    }

}
