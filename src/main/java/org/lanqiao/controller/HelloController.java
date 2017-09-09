package org.lanqiao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 陈 on 2017/9/1.
 */
@Controller //告诉spring 这个类是一个Controller
@RequestMapping("/go") //请求地址 到HelloController 类
public class HelloController {
    @RequestMapping("/go.do")  //根据 login.do 到这个方法 之后到解析器
    public String hello(){
        return "index";
    }
    // forward：转发    redirect：重定向
    @RequestMapping("/go2.do")
    public String hello2(){
        return "redirect:/index.jsp";
    }
    @RequestMapping("/go3.do")
    public ModelAndView hello3(){
        Map map=new HashMap();
        map.put("a" ,"123");
        return new ModelAndView("redirect:/index.jsp",map);
    }
}
