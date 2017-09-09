package org.lanqiao.service.impl;


import org.apache.log4j.Logger;
import org.lanqiao.bean.Login;
import org.lanqiao.dao.ISys_loginDao;
import org.lanqiao.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


/**
 * Created by 陈 on 2017/8/30.
 */
@Service     //告诉spring 这是一个service  同时把这个类注册到spring
public class LoginServiceImpl implements LoginService {
    //创建log4j的对象
    Logger logger= Logger.getLogger(LoginServiceImpl.class);
    //让spring 注入一个dao  autowired 会根据类型去匹配对应的对象
    @Autowired
    private ISys_loginDao dao;
    @Override
    public List<Login> getAll() {
        logger.info("进入找到全部的方法");
        System.out.println("进入找到全部的方法");
        return dao.getAll();
    }
    @Override
    public Login getLoginById(int id) {
        System.out.println("进入根据id查询");
        return dao.getLoginById(id);
    }
    @Override
    public int updateUser(Login login) {
        return dao.updateById(login);
    }

    @Override
    public List<Login> getLoginByCondition(Login login) {
        return dao.getLoginByCondition(login);
    }

    @Override
    public List<Login> findLoginByCondition(Login login) {

        return dao.findLoginByCondition(login);
    }

    @Override
    public int addLogin(Login login) {
        return dao.addLogin(login);
    }

    @Override
    public int delLogin(int id) {
        return dao.delLogin(id);
    }
}
