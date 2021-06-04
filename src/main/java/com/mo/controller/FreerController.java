package com.mo.controller;

import com.mo.mapper.FreerMapper;
import com.mo.mapper.FreerTypeMapper;
import com.mo.pojo.Freer;
import com.mo.pojo.FreerType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

/**
 * @create 2021-06-04 21:01
 */
@Controller
public class FreerController {
    @Autowired
    private FreerMapper freerMapper;

    @Autowired
    private FreerTypeMapper freerTypeMapper;


    //查询所有
    @RequestMapping("/freers")
    public String list(Model model){
        Collection<Freer> freers = freerMapper.getAll();
        model.addAttribute("freers",freers);
        return "freer/list";
    }

    @GetMapping("/freer")
    public String toAdd(Model model){
        //查找所有部门的信息
        Collection<FreerType> freerTypes = freerTypeMapper.getAll();
        model.addAttribute("freertypes",freerTypes);
        return "freer/add";
    }

    @PostMapping("/freer")
    public String add(Freer freer){
        //添加操作
        freerMapper.addFreer(freer);
        return "redirect:/freers";
    }


    @GetMapping("/freer/{id}")
    public String toUpdate(@PathVariable("id")int id, Model model){
        //查询原来的数据
        Freer freer = freerMapper.getFreerById(id);
        model.addAttribute("freer",freer);
        //查找所有部门的信息
        Collection<FreerType> freerTypes = freerTypeMapper.getAll();
        model.addAttribute("freertypes",freerTypes);
        return "freer/update";
    }


    @RequestMapping("/updateFreer")
    public String update(Freer freer){
        freerMapper.addFreer(freer);
        return "redirect:/freers";
    }

    @RequestMapping("/deletFreer/{id}")
    public String delete(@PathVariable("id")int id){
        freerMapper.removeFreer(id);
        return "redirect:/freers";
    }



}
