package org.lanqiao.bean;

/**
 * Created by 陈 on 2017/8/28.
 */
public class Login {
    // 命名规范 命名规则 有问题 应该loginId
    //配置的文件找不到
    // 1.用别名
    // 2.
    private int loginId;
    private String username;
    private String password;
    private String email;
    private String wxname;

    public Login(int i, String aaa, String email, String ss) {
    }

    public Login(int loginId, String username, String password, String email, String wxname) {
        this.loginId = loginId;
        this.username = username;
        this.password = password;
        this.email = email;
        this.wxname = wxname;
    }

    public Login() {
        this.username = username;
        this.password = password;
        this.email = email;
        this.wxname = wxname;
    }

    public int getLogin_id() {
        return loginId;
    }

    public void setLogin_id(int login_id) {
        this.loginId = login_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWxname() {
        return wxname;
    }

    public void setWxname(String wxname) {
        this.wxname = wxname;
    }

    @Override
    public String toString() {
        return "Login{" +
                "login_id=" + loginId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", wxname='" + wxname + '\'' +
                '}';
    }
}
