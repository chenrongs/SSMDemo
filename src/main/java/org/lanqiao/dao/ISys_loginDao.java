package org.lanqiao.dao;


import org.lanqiao.bean.Login;

import java.util.List;


/**
 * Created by 陈 on 2017/8/29.
 */
public interface ISys_loginDao {


    /**
     * 查询所有用户
     *
     * @return 用户集合
     */

    List<Login> getAll();

    /**
     * 根据id的值查询一个用户
     *
     * @param id 用户id
     * @return 执行结果
     */
    Login getLoginById(int id);

    /**
     * 增加用户
     *
     * @param login 传入用户信息
     * @return 执行结果
     */

    int addLogin(Login login);

    /**
     * 删除用户
     *
     * @param id 用户id
     * @return 执行结果
     */

    int delLogin(int id);

    /**
     * 更新对象的信息
     *
     * @param login 传入用户的新信息
     * @return 返回修改后的用户对象
     */

    int updateById(Login login);

    /**
     * 根据条件查询
     *
     * @param login 传入用户输入对象
     * @return 返回集合
     */
    List<Login> getLoginByCondition(Login login);

    /**
     * 优先级条件查询
     *
     * @param login 传入对象
     * @return 返回对象集合
     */
    List<Login> findLoginByCondition(Login login);

    /**
     * 根据id 修改用户信息
     *
     * @param login 传入用户id
     * @return 返回int
     */
    int updateLogin(Login login);

    /**
     * 批量查询----批量删除
     *
     * @param list login_id 集合
     * @return 返回执行的行数
     */
    List<Integer> get(List<Integer> list);
}
