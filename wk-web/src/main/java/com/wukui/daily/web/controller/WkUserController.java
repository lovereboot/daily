package com.wukui.daily.web.controller;

import com.wukui.daily.dal.dao.WkUserDao;
import com.wukui.daily.dal.model.WkUserDO;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;


/**
 * Created by fucai.zhangfc on 2015/12/7.
 */
@Controller
@RequestMapping("/user")
public class WkUserController {

    @Resource
    private WkUserDao wkUserDao;

    @RequestMapping(value="/userDetail", method = RequestMethod.GET)
    public String queryUser(ModelMap model) {
        WkUserDO user = wkUserDao.queryById(1);
        model.addAttribute("message", "Spring 3 MVC Hello World" + ToStringBuilder.reflectionToString(user));
        return "userDetail";
    }
}
