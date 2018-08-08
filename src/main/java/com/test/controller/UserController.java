package com.test.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.service.IDictService;
import com.test.service.IUserService;


@Controller
@RequestMapping("/user")
public class UserController {
     
    @Autowired
    private IUserService userService;
    @Autowired
    private IDictService dictService;
     
    /*
     * 用户列表与分页Action
     */
    @RequestMapping("/list")
    public String list(Model model,@RequestParam(required=false,defaultValue="1") int pageNO){
        int size=5;
        model.addAttribute("size",size);
        model.addAttribute("pageNO",pageNO);
        model.addAttribute("count",userService.queryUserCount());
        model.addAttribute("userList", userService.queryUserPager(pageNO, size));
        return "list";
    }
}