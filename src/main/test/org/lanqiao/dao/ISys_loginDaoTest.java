package org.lanqiao.dao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lanqiao.bean.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 陈 on 2017/9/4.
 */
//告诉spring测试类
@RunWith(SpringJUnit4ClassRunner.class)
//加载Spring 配置文件
@ContextConfiguration("classpath:spring-mybatis.xml")
public class ISys_loginDaoTest {
    @Autowired
    private ISys_loginDao dao;
    @Test
    public void updateLogin() throws Exception {
        Login login=new Login();
        login.setLogin_id(34);
        login.setUsername("aaa");
        dao.updateLogin(login);
    }
    @Test
    public  void get() throws Exception{
        List<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(34);
        list.add(33);
        list.add(32);
        dao.get(list);
    }

}