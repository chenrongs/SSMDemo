package org.lanqiao.controller;
import org.lanqiao.bean.Login;
import org.lanqiao.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
/**
 * Created by 陈 on 2017/9/1.
 */
/*
*
* REST 风格
* RESTFul 风格
* */
@Controller
@RequestMapping("/Login")
public class LoginController {
    @Autowired
    private LoginService service;
    @RequestMapping("goLogin.do")
    public String goLogin(Login login){
        System.out.println(login);
        return "show";
    }
    //测试----------
    @RequestMapping("/base.do")
    @ResponseBody //该注解是将内容对象
    public String base(Login login){
        return login+"";
    }

    @RequestMapping("/getAll.do")
    public ModelAndView getAll(){
        List<Login> list = service.getAll();
        ModelAndView modelAndView=new ModelAndView("show");
        modelAndView.addObject("list",list);
        return modelAndView;
    }

    @RequestMapping(value = "",method = RequestMethod.GET)
    @ResponseBody
    public List<Login> get(){
        return service.getAll();
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Login getOne(@PathVariable int id){
        return service.getLoginById(id);
    }

    @RequestMapping(value = "",method = RequestMethod.POST)
    @ResponseBody
    public int add(@RequestBody Login login){
        System.out.println(login);
        return service.addLogin(login);
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public int del(@PathVariable int id){
        return service.delLogin(id);
    }

}
