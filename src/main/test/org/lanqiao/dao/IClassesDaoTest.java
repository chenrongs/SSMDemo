package org.lanqiao.dao;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/**
 * Created by 陈 on 2017/9/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class IClassesDaoTest {
    @Autowired
    IClassesDao dao;
    @Test
    public void classResultMap() throws Exception {
        System.out.println("----------------------");
        System.out.println(dao.getInfo());
    }
}