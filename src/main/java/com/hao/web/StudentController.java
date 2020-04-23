package com.hao.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hao.bean.Student;
import com.hao.service.StudentService;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("add")
    private String add() {
        Student user1 = new Student(1, "张三", 10);
        Student user2 = new Student(2, "李四", 20);
        Student user3 = new Student(3, "王五", 30);
        studentService.insert(user1);
        studentService.insert(user2);
        studentService.insert(user3);
        return "add success";
    }

    @GetMapping("getList")
    private List<Student> get() {
        List<Student> list = studentService.getList();
        return list;
    }

}
