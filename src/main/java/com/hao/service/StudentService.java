package com.hao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hao.bean.Student;
import com.hao.dao.cluster.StudentMapper;

@Service
public class StudentService {
    
    @Autowired
    StudentMapper studentMapper;
    
    public Integer insert(Student student) {
        return studentMapper.insert(student);
    }

    public List<Student> getList() {
        return studentMapper.getAll();
    }

}
