package org.lanqiao.service;


import org.lanqiao.bean.Login;

import java.util.List;

/**
 * Created by 陈 on 2017/8/30.
 */

public interface LoginService {
    /**
     * 查询所有
     * @return 用户集合
     */
    List<Login> getAll();

    /**
     * 根据id查用户
     * @return 一个用户
     */
    Login getLoginById(int id);

    /**
     * 更新用户
     * @param login  传入用户
     * @return 是否更新
     */
    int updateUser(Login login);

    /**
     * 根据 条件查询
     * @param login 传入用户输入信息
     * @return 返回集合
     */
    List<Login> getLoginByCondition(Login login);

    /**
     * 优先级条件查询
     * @param login 传入对象
     * @return 返回对象集合
     */
    List<Login> findLoginByCondition(Login login);

    /**
     * 增加用户
     * @param login  传入用户对象
     * @return 返回是否添加成功
     */
    int addLogin(Login login);

    /**
     * 删除方法
     * @param id 传入id
     * @return 返回结果
     */
    int delLogin(int id);

}
