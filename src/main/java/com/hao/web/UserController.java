package com.hao.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.hao.bean.User;
import com.hao.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("add")
    private String add() {
        User user1 = new User(1, "张三", 10);
        User user2 = new User(2, "李四", 20);
        User user3 = new User(3, "王五", 30);
        userService.insert(user1);
        userService.insert(user2);
        userService.insert(user3);
        return "add success";
    }

    @GetMapping("getList")
    private List<User> get() {
        Page<?> page =PageHelper.startPage(1,2); 
        List<User> list = userService.getList();
        System.out.println("总共有:"+page.getTotal()+"条数据,实际返回:"+list.size()+"两条数据!");
        return list;
    }

}
