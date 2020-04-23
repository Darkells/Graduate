package com.dark.graduate.lesson.controller;

import com.dark.graduate.lesson.feign.UserFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vo.R;

@RestController
@RequestMapping("lesson")
public class LessonController {
    private UserFeignService userFeignService;

    @Autowired
    public void setUserFeignService(UserFeignService u) {
        this.userFeignService = u;
    }

    @GetMapping("test")
    public R Test() {
        return userFeignService.StudentList(1, 2, null);
    }
}
