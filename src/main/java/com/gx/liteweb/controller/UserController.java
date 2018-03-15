package com.gx.liteweb.controller;

import com.alibaba.fastjson.JSON;
import com.gx.liteweb.domain.User;
import com.gx.liteweb.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/userCenter")
public class UserController {
    private static final Logger LOG = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user.html")
    public String user() {
        LOG.info("user");
        return "view/user";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public int addUser(@RequestBody User user) {
        LOG.info("addUser input:{}", JSON.toJSONString(user));
        return userService.addUser(user);
    }

    @RequestMapping(value = "/qry", method = RequestMethod.POST)
    @ResponseBody
    public List<User> qryUser(@RequestBody User user) {
        LOG.info("qryUser input:{}", JSON.toJSONString(user));
        return userService.qryUser(user);
    }
}
