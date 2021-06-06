package com.mo.controller;

import com.mo.mapper.ManagerMapper;
import com.mo.pojo.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;

/**
 * @create 2021-04-01 15:35
 */

@Controller
public class LoginController {

    @Autowired
    private ManagerMapper managerMapper;

    //登录
    @RequestMapping("/user/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password,
                        Model model, HttpSession session){

        if(!StringUtils.isEmpty(username) && managerMapper.getPassword(username).equals(password)){
            session.setAttribute("loginUser",username);
            return "redirect:/main.html";
        }else {
            model.addAttribute("msg","密码或用户名错误！");
            return "index";
        }

    }


    //注销
    @RequestMapping("/user/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/main.html";
    }



}
