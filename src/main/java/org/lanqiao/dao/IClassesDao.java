package org.lanqiao.dao;

import org.lanqiao.bean.Course;

import java.util.List;

/**
 * Created by 陈 on 2017/9/4.
 */
public interface IClassesDao {
    /**
     * 一对多的关系  建立映射
     * @return  返回集合
     */
    List<Course> getInfo();
}
