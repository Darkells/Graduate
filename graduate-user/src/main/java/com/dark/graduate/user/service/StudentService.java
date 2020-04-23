package com.dark.graduate.user.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.dark.graduate.user.pojo.Student;

import java.util.List;

public interface StudentService {
    IPage<Student> Students(IPage<Student> iPage, String query);
}
