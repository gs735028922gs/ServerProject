package com.mo.controller;

import com.mo.mapper.ManagerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @create 2021-06-04 14:57
 */
@Controller
public class Controller01 {
    @RequestMapping({"/","/index"})
    public String index(){
        return "index";
    }


}
