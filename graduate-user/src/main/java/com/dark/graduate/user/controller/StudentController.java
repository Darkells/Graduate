package com.dark.graduate.user.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dark.graduate.user.pojo.Student;
import com.dark.graduate.user.service.StudentService;
import constant.ResultCodeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vo.R;
import vo.RList;

@RestController
@RequestMapping("user/student")
public class StudentController {
    private StudentService studentService;

    @Autowired
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping("list")
    public R StudentList(Integer pagenum, Integer pagesize, String query) {
        IPage<Student> iPage = new Page<>(pagenum, pagesize);
        iPage = studentService.Students(iPage, query);
        RList r = new RList(pagenum, pagesize, iPage.getTotal(), iPage.getRecords());
        return R.setResult(ResultCodeEnum.SUCCESS).data(r);
    }
}
