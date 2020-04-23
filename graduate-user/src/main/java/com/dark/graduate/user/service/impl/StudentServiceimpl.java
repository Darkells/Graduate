package com.dark.graduate.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.dark.graduate.user.mapper.StudentMapper;
import com.dark.graduate.user.pojo.Student;
import com.dark.graduate.user.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentServiceimpl implements StudentService {
    private StudentMapper studentMapper;

    @Autowired
    public void setStudentMapper(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @Override
    public IPage<Student> Students(IPage<Student> iPage, String query) {
        QueryWrapper<Student> q = new QueryWrapper<>();
        q.like((query != null && query.isEmpty()), "name", query);
        studentMapper.selectPage(iPage, q);
        return iPage;
    }
}
