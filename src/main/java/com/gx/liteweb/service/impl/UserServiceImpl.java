package com.gx.liteweb.service.impl;

import com.alibaba.fastjson.JSON;
import com.gx.liteweb.dao.UserDao;
import com.gx.liteweb.domain.User;
import com.gx.liteweb.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserServiceImpl")
public class UserServiceImpl implements UserService {
    private static final Logger LOG = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;

    @Override
    public int addUser(User user) {
        LOG.info("addUser input:{}", JSON.toJSONString(user));
        return userDao.insert(user);
    }

    @Override
    public List<User> qryUser(User user) {
        LOG.info("qryUser input:{}", JSON.toJSONString(user));
        return userDao.selectUserByCon(user);
    }
}
