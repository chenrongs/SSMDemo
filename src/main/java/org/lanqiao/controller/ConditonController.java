package org.lanqiao.controller;

import org.lanqiao.bean.Login;
import org.lanqiao.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 陈 on 2017/9/2.
 */

@Controller
@RequestMapping("/cha")
public class ConditonController {
    @Autowired
    private LoginService service;


    @RequestMapping("/select.do")
    public ModelAndView get(Login login){
        List<Login> list=service.getLoginByCondition(login);
        System.out.println(list);
        Map<String, List<Login>> map=new HashMap<String, List<Login>>();
        map.put("list",list);
        return new ModelAndView("show",map);

    }
    @RequestMapping("/select2.do")
    public ModelAndView get2(Login login) {
        List<Login> list=service.findLoginByCondition(login);
        System.out.println(list);
        Map<String, List<Login>> map=new HashMap<String, List<Login>>();
        map.put("list",list);
        return new ModelAndView("show",map);
    }
}















